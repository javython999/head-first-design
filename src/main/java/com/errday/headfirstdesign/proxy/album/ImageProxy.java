package com.errday.headfirstdesign.proxy.album;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {

    private volatile ImageIcon imageIcon;
    private final URL imageURL;
    private Thread retrievalThread;
    private boolean retrieving = false;

    public ImageProxy(URL imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public int getIconWidth() {
        if (imageIcon != null) {
            return imageIcon.getIconWidth();
        }

        return 800;
    }

    @Override
    public int getIconHeight() {
        if (imageIcon != null) {
            return imageIcon.getIconHeight();
        }

        return 600;
    }

    synchronized void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    @Override
    public void paintIcon(Component component, Graphics graphics, int x, int y) {
        if (imageIcon != null) {
            imageIcon.paintIcon(component, graphics, x, y);
            return;
        }

        graphics.drawString("앨범 커버를 불러오는 중입니다. 잠시만 기다려 주세요.", x + 300, y + 190);

        if (!retrieving) {
            retrieving = true;

            retrievalThread = new Thread(() -> {
                setImageIcon(new ImageIcon(imageURL, "Album Cover"));
                component.repaint();
            });
            retrievalThread.start();
        }
    }
}
