/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;


// Importar la clase Velocidad desde el paquete codigo
import codigo.Velocidad;
import codigo.Datos;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
/**
 *
 * @author migue
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
         // Centrar la ventana en la pantalla
        setLocationRelativeTo(null);
        // Deshabilitar el botón de maximizar
        setResizable(false);
        
        // Vincula el evento de apertura de la ventana
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        valorInput1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        unidadOrigenCombo1 = new javax.swing.JComboBox<>();
        menu1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        unidadDestinoCombo1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        textResp1 = new javax.swing.JTextArea();
        convertirbtn1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        valorInput2 = new javax.swing.JTextField();
        unidadOrigenCombo2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        unidadDestinoCombo2 = new javax.swing.JComboBox<>();
        menu2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textResp2 = new javax.swing.JTextArea();
        convertirbtn2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        valorInput1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        valorInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorInput1ActionPerformed(evt);
            }
        });
        valorInput1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorInput1KeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel1.setText("Ingresa el Valor:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel4.setText("Unidad de Origen:");

        unidadOrigenCombo1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        unidadOrigenCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(m/s)", "(km/h)", "(mph)", "(ft/s)", "(kn)" }));

        menu1.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        menu1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel5.setText("Unidad de Destino:");

        unidadDestinoCombo1.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        unidadDestinoCombo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(m/s)", "(km/h)", "(mph)", "(ft/s)", "(kn)" }));

        textResp1.setEditable(false);
        textResp1.setColumns(20);
        textResp1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        textResp1.setRows(5);
        jScrollPane2.setViewportView(textResp1);

        convertirbtn1.setText("Convertir");
        convertirbtn1.setEnabled(false);
        convertirbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirbtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(valorInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unidadOrigenCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(unidadDestinoCombo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(convertirbtn1))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorInput1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(unidadOrigenCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(unidadDestinoCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(convertirbtn1)
                                .addGap(30, 30, 30)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Velocidad", jPanel1);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel2.setText("Ingresa el Valor:");

        valorInput2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        valorInput2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorInput2ActionPerformed(evt);
            }
        });
        valorInput2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorInput2KeyTyped(evt);
            }
        });

        unidadOrigenCombo2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        unidadOrigenCombo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(b)", "(Kb)", "(Mb)", "(Gb)", "(Tb)", "(Pb)", "(Eb)", "(Zb)", "(Yb)", "(Kib)", "(Mib)", "(Gib)", "(Tib)", "(KB)", "(MB)", "(GB)", "(TB)", "(PB)", "(EB)", "(ZB)", "(YB)", "(PiB)" }));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel3.setText("Unidad de Origen:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel6.setText("Unidad de Destino:");

        unidadDestinoCombo2.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        unidadDestinoCombo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(b)", "(Kb)", "(Mb)", "(Gb)", "(Tb)", "(Pb)", "(Eb)", "(Zb)", "(Yb)", "(Kib)", "(Mib)", "(Gib)", "(Tib)", "(KB)", "(MB)", "(GB)", "(TB)", "(PB)", "(EB)", "(ZB)", "(YB)", "(PiB)" }));

        menu2.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        menu2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        textResp2.setEditable(false);
        textResp2.setColumns(20);
        textResp2.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        textResp2.setRows(5);
        jScrollPane1.setViewportView(textResp2);

        convertirbtn2.setText("Convertir");
        convertirbtn2.setEnabled(false);
        convertirbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertirbtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(unidadOrigenCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(convertirbtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(valorInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(unidadDestinoCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1))
                .addGap(32, 32, 32)
                .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(valorInput2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(unidadOrigenCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(unidadDestinoCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(convertirbtn2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tamaño Datos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorInput1ActionPerformed
        // Accion de uso del input para ejecutar la convercion de velocidad ingresada
        
        String input = valorInput1.getText();
        boolean isValid = input.chars().allMatch(c -> Character.isDigit(c) || c == '-' || c == '.' || c == 'e' || c == 'E');

        // Usar una expresión ternaria para enfocar el ComboBox si la entrada es válida
        Runnable action = isValid ? () -> {
            unidadOrigenCombo1.requestFocus();
            convertirbtn1.setEnabled(true);
        } : () -> {
            JOptionPane.showMessageDialog(this, "Entrada no válida. Por favor, ingrese un número o notación científica válida.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            valorInput1.setText("");
            convertirbtn1.setEnabled(false);
        };
        action.run();    
        
        // Asegurarse de que el botón se habilite si se corrige la entrada
        convertirbtn1.setEnabled(!input.isEmpty());
        
    }//GEN-LAST:event_valorInput1ActionPerformed

    private void valorInput2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorInput2ActionPerformed
        // Accion de uso del input para ejecutar la convercion de tamaño de datos ingresados
    
        String input = valorInput2.getText();
        boolean isValid = input.chars().allMatch(c -> Character.isDigit(c) || c == '-' || c == '.' || c == 'e' || c == 'E');

        // Usar una expresión ternaria para enfocar el ComboBox si la entrada es válida
        Runnable action = isValid ? () -> {
            unidadOrigenCombo2.requestFocus();
            convertirbtn2.setEnabled(true);
        } : () -> {
            JOptionPane.showMessageDialog(this, "Entrada no válida. Por favor, ingrese un número o notación científica válida.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            valorInput2.setText("");
            convertirbtn2.setEnabled(false);
        };
        action.run();
        
        // Asegurarse de que el botón se habilite si se corrige la entrada
        convertirbtn2.setEnabled(!input.isEmpty());
        
    }//GEN-LAST:event_valorInput2ActionPerformed

    private void valorInput1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorInput1KeyTyped
       //ahora puede ingresar datos exclusivamente numeros o notacion cientifica
       char c = evt.getKeyChar();
       boolean isDigit = Character.isDigit(c);
       boolean isScientificNotation = c == '-' || c == '.' || c == 'e' || c == 'E';
       Runnable action = (isDigit || isScientificNotation) ? () -> {} : evt::consume;
       action.run();
    }//GEN-LAST:event_valorInput1KeyTyped

    private void valorInput2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorInput2KeyTyped
        //ahora puede ingresar datos exclusivamente numeros o notacion cientifica
       char c = evt.getKeyChar();
       boolean isDigit = Character.isDigit(c);
       boolean isScientificNotation = c == '-' || c == '.' || c == 'e' || c == 'E';
       Runnable action = (isDigit || isScientificNotation) ? () -> {} : evt::consume;
       action.run();
       
       
    }//GEN-LAST:event_valorInput2KeyTyped

    private void convertirbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirbtn1ActionPerformed
        //boton para convertir la velocidad a lo seleccionado:

        try {
            // Obtener el valor ingresado
            String input = valorInput1.getText();
            String mensaje = input.isEmpty() 
                ? "El campo de entrada está vacío.\n" 
                : "";

            double valor = input.isEmpty() 
                ? 0 
                : Double.parseDouble(input);

            // Obtener las unidades de origen y destino seleccionadas
            String unidadOrigen = (String) unidadOrigenCombo1.getSelectedItem();
            String unidadDestino = (String) unidadDestinoCombo1.getSelectedItem();

            mensaje += (unidadOrigen == null || unidadDestino == null) 
                ? "Debe seleccionar unidades de origen y destino.\n" 
                : "Unidad de origen: " + unidadOrigen + "\nUnidad de destino: " + unidadDestino + "\n";

            // Limpiar las unidades de posibles paréntesis
            unidadOrigen = unidadOrigen.replaceAll("[()]", "").trim();
            unidadDestino = unidadDestino.replaceAll("[()]", "").trim();

            // Crear una instancia de la clase Velocidad
            Velocidad velocidad = new Velocidad(valor);

            // Realizar la conversión
            String resultado = velocidad.convertir(unidadOrigen, unidadDestino);

            // Agregar el resultado al mensaje
            mensaje += valor + " " + unidadOrigen + " es igual a " + resultado;

            // Mostrar el mensaje en el área de texto correspondiente
            textResp1.setText(mensaje);
        } catch (NumberFormatException e) {
            textResp1.setText("Por favor, ingrese un número válido.\n");
        } catch (NullPointerException e) {
            textResp1.setText("Conversión no válida. Por favor, seleccione unidades válidas.\n");
        }          
    }//GEN-LAST:event_convertirbtn1ActionPerformed

    private void convertirbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertirbtn2ActionPerformed
         //boton para convertir la Tamaño de Datos lo seleccionado:

        try {
            // Obtener el valor ingresado
            String input = valorInput2.getText();
            String mensaje = input.isEmpty() 
                ? "El campo de entrada está vacío.\n" 
                : "";

            double valor = input.isEmpty() 
                ? 0 
                : Double.parseDouble(input);

            // Obtener las unidades de origen y destino seleccionadas
            String unidadOrigen = (String) unidadOrigenCombo2.getSelectedItem();
            String unidadDestino = (String) unidadDestinoCombo2.getSelectedItem();

            mensaje += (unidadOrigen == null || unidadDestino == null) 
                ? "Debe seleccionar unidades de origen y destino.\n" 
                : "Unidad de origen: " + unidadOrigen + "\nUnidad de destino: " + unidadDestino + "\n";

            // Limpiar las unidades de posibles paréntesis
            unidadOrigen = unidadOrigen.replaceAll("[()]", "").trim();
            unidadDestino = unidadDestino.replaceAll("[()]", "").trim();

            // Crear una instancia de la clase Datos
            Datos datos = new Datos(valor);

            // Realizar la conversión
            String resultado = datos.convertir(unidadOrigen, unidadDestino);

            // Agregar el resultado al mensaje
            mensaje += valor + " " + unidadOrigen + " es igual a " + resultado;

            // Mostrar el mensaje en el área de texto correspondiente
            textResp2.setText(mensaje);
        } catch (NumberFormatException e) {
            textResp2.setText("Por favor, ingrese un número válido.\n");
        } catch (NullPointerException e) {
            textResp2.setText("Conversión no válida. Por favor, seleccione unidades válidas.\n");
        }          
    }//GEN-LAST:event_convertirbtn2ActionPerformed

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        // Texto por defecto con concatenaciones
         String defaultText = "<strong>Unidades de velocidad soportadas: </Strong><br><br>"
            + "- Metro por segundo (m/s)<br>"
            + "- Kilómetro por hora (km/h)<br>"
            + "- Milla por hora (mph)<br>"
            + "- Pie por segundo (ft/s)<br>"
            + "- Nudo (kn)";
        
        // Convierte el texto a HTML
        String htmlText = strToHtml(defaultText);
        
        // Establece el texto en el label menu1
        menu1.setText(htmlText);
        // Texto por defecto con concatenaciones para menu2
        String defaultText2 = "<strong>Unidades de tamaño de datos soportadas: </strong><br><br>"
            + "- Bit (b)<br>"
            + "- Kilobit (Kb)<br>"
            + "- Megabit (Mb)<br>"
            + "- Gigabit (Gb)<br>"
            + "- Terabit (Tb)<br>"
            + "- Petabit (Pb)<br>"
            + "- Exabit (Eb)<br>"
            + "- Zettabit (Zb)<br>"
            + "- Yottabit (Yb)<br>"
            + "- Kibibit (Kib)<br>"
            + "- Mebibit (Mib)<br>"
            + "- Gibibit (Gib)<br>"
            + "- Tebibit (Tib)<br>"
            + "- Kilobyte (KB)<br>"
            + "- Megabyte (MB)<br>"
            + "- Gigabyte (GB)<br>"
            + "- Terabyte (TB)<br>"
            + "- Petabyte (PB)<br>"
            + "- Exabyte (EB)<br>"
            + "- Zettabyte (ZB)<br>"
            + "- Yottabyte (YB)<br>"
            + "- Pebibyte (PiB)";

        
        // Convierte el texto a HTML y establece en menu2
        String htmlText2 = strToHtml(defaultText2);
        menu2.setText(htmlText2);
    }

    public String strToHtml(String htmlText) {
        // Tu lógica para convertir el texto a HTML
        return "<html><p>" + htmlText + "</p></html>";
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton convertirbtn1;
    private javax.swing.JButton convertirbtn2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel menu1;
    private javax.swing.JLabel menu2;
    private javax.swing.JTextArea textResp1;
    private javax.swing.JTextArea textResp2;
    private javax.swing.JComboBox<String> unidadDestinoCombo1;
    private javax.swing.JComboBox<String> unidadDestinoCombo2;
    private javax.swing.JComboBox<String> unidadOrigenCombo1;
    private javax.swing.JComboBox<String> unidadOrigenCombo2;
    private javax.swing.JTextField valorInput1;
    private javax.swing.JTextField valorInput2;
    // End of variables declaration//GEN-END:variables
}
