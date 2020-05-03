package com.rk.mk;

import javax.swing.*;
import java.awt.*;

public class FormUtama extends JFrame {
    public FormUtama() {
        super("Kustom Kursor");
        Inisialisasi_Komponen();
        AturKursorBaru();
    }

    public void Inisialisasi_Komponen() {
        setPreferredSize(new Dimension(500, 500));
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void AturKursorBaru() {
        Toolkit AlatKursor = Toolkit.getDefaultToolkit();
        Image Gambar = AlatKursor.getImage("gambar/bahasapemrograman.png");
        Point Titik = new Point(0, 0);
        Cursor Kursor = AlatKursor.createCustomCursor(Gambar, Titik, "Kursor Baru");
        setCursor(Kursor);
    }
}
