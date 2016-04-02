/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package other;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

/**
 *
 * @author Adil
 */
public class Hyperlink extends JLabel {
    private Color underlineColor = null;

public Hyperlink(String label) {
//super(label);

setForeground(Color.BLUE.darker());
setCursor(new Cursor(Cursor.HAND_CURSOR));
addMouseListener(new HyperlinkLabelMouseAdapter());
}

@Override
protected void paintComponent(Graphics g) {
super.paintComponent(g);

g.setColor(underlineColor == null ? getForeground() : underlineColor);

Insets insets = getInsets();

int left = insets.left;
if (getIcon() != null)
left += getIcon().getIconWidth() + getIconTextGap();

g.drawLine(left, getHeight() - 1 - insets.bottom,
(int) getPreferredSize().getWidth() - insets.right, getHeight()
- 1 - insets.bottom);
}

public class HyperlinkLabelMouseAdapter extends MouseAdapter {
@Override
public void mouseClicked(MouseEvent e) {
System.out.println(getText());
}
}
}
