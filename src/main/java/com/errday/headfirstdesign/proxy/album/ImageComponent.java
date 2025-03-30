package com.errday.headfirstdesign.proxy.album;

import javax.swing.*;
import java.awt.*;

public class ImageComponent extends JComponent {
    private static final long serialVersionUID = 1L;
    private Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        int width = icon.getIconWidth();
        int height = icon.getIconHeight();
        int x = (800 - width) / 2;
        int y = (600 - height) / 2;
        icon.paintIcon(this, graphics, x, y);
    }
}
