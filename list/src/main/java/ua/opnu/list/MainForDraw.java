package ua.opnu.list;


import ua.opnu.list.DrawFrame;

import javax.swing.*;

public class MainForDraw {

    public static void main(String[] args) {

        // Створення GUI в окремому потоці
        // Для ознайомлення з додатком, див. вміст класу DrawFrame
        SwingUtilities.invokeLater(() -> new DrawFrame("Програма Draw"));
    }
}