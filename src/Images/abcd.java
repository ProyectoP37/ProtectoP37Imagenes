package Images;

import java.awt.Image;
import javax.swing.ImageIcon;

public class abcd extends javax.swing.JFrame {
    private static final long serialVersionUID = -2175359093678346508L;

    public abcd() {
        initComponents();

        cargarImagenes();
    }

    private void cargarImagenes() {
        Image imagenInterna = new ImageIcon(getClass().getResource("Bulbasaur.jpg")).getImage();
        jPanelConFondo1.setImagen(imagenInterna);

        Image imagenExterna = new ImageIcon(getClass().getResource("Charmander.jpeg")).getImage();
        jPanelConFondo2.setImagen(imagenExterna);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        final javax.swing.JLabel lbInterna = new javax.swing.JLabel();
        final javax.swing.JLabel lbExterna = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carga de Imagenes");

        jPanelConFondo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbInterna.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbInterna.setForeground(new java.awt.Color(255, 204, 102));
        lbInterna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        

        javax.swing.GroupLayout jPanelConFondo1Layout = new javax.swing.GroupLayout(jPanelConFondo1);
        jPanelConFondo1.setLayout(jPanelConFondo1Layout);
        jPanelConFondo1Layout.setHorizontalGroup(
            jPanelConFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConFondo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbInterna, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelConFondo1Layout.setVerticalGroup(
            jPanelConFondo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelConFondo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbInterna, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelConFondo2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbExterna.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbExterna.setForeground(new java.awt.Color(255, 204, 102));
        lbExterna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        

        javax.swing.GroupLayout jPanelConFondo2Layout = new javax.swing.GroupLayout(jPanelConFondo2);
        jPanelConFondo2.setLayout(jPanelConFondo2Layout);
        jPanelConFondo2Layout.setHorizontalGroup(
            jPanelConFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 172, Short.MAX_VALUE)
            .addGroup(jPanelConFondo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbExterna, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelConFondo2Layout.setVerticalGroup(
            jPanelConFondo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
            .addGroup(jPanelConFondo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbExterna, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelConFondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelConFondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanelConFondo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelConFondo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                abcd ci = new abcd();
                ci.setLocationRelativeTo(null);
                ci.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private final Prueba.Main jPanelConFondo1 = new Prueba.Main();
    private final Prueba.Main jPanelConFondo2 = new Prueba.Main();
    // End of variables declaration  
}
