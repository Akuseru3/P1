/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author Akuseru
 */
public class mainWindow extends javax.swing.JFrame {
    String screen = "";
    int y1=0,y2=160;
    int memory;int hardDMemory;int fileManager = 0;
    ArrayList<Integer> values = new ArrayList<Integer>();
    Data dataManagment;
    Nucleo nucleo1;
    Nucleo nucleo2;
    ArrayList<JTable> tables = new ArrayList<JTable>(); 
    ArrayList<PCB> controlBlocks = new ArrayList<PCB>(); 
    DefaultListModel<String> modelMemory = new DefaultListModel<>();
    DefaultListModel<String> modelHARDMemory = new DefaultListModel<>();
    DefaultListModel<String> queue2Model = new DefaultListModel<>();
    DefaultListModel<String> queue1Model = new DefaultListModel<>();
    /**
     * Creates new form mainWindow
     */
    public mainWindow() {
        initComponents();
        
    }
    public mainWindow(int valueMemory,int valueMemory2,ArrayList<Integer> list){
        initComponents();
        memory=valueMemory;
        hardDMemory = valueMemory2;
        values = list;
        nucleo1 = new Nucleo("En Espera",0);
        nucleo2 = new Nucleo("En Espera",0);
        dataManagment = new Data(memory,hardDMemory,values);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNext = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        workQueue1List = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        listHARDMemory = new javax.swing.JList<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        listMemory = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        Nucleo2 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        Nucleo1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtKeyboard = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtScreen = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelPCB = new javax.swing.JPanel();
        btnLoad = new javax.swing.JButton();
        btnExecute = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        workQueue2List = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        filesTable = new javax.swing.JTable();
        lbTiempoN2 = new javax.swing.JLabel();
        lbCursoN2 = new javax.swing.JLabel();
        lbCursoN1 = new javax.swing.JLabel();
        lbTiempoN1 = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNext.setText("jButton1");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        getContentPane().add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        jScrollPane11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 170, 181), 3));

        workQueue1List.setBackground(new java.awt.Color(44, 47, 51));
        workQueue1List.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane11.setViewportView(workQueue1List);

        getContentPane().add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 190, 130));

        listHARDMemory.setBackground(new java.awt.Color(44, 47, 51));
        listHARDMemory.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane6.setViewportView(listHARDMemory);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 230, 230));

        jScrollPane10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 170, 181), 3));

        listMemory.setBackground(new java.awt.Color(44, 47, 51));
        listMemory.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane10.setViewportView(listMemory);

        getContentPane().add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 190, 230));

        Nucleo2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Nucleo2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane7.setViewportView(Nucleo2);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 640, 480, 60));

        Nucleo1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Nucleo1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Nucleo1.setRowSelectionAllowed(false);
        jScrollPane5.setViewportView(Nucleo1);
        Nucleo1.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 520, 480, 60));

        txtKeyboard.setBackground(new java.awt.Color(44, 47, 51));
        txtKeyboard.setColumns(20);
        txtKeyboard.setForeground(new java.awt.Color(255, 255, 255));
        txtKeyboard.setRows(5);
        txtKeyboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 170, 181), 3));
        txtKeyboard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKeyboardKeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(txtKeyboard);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 480, 100));

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));

        txtScreen.setEditable(false);
        txtScreen.setBackground(new java.awt.Color(44, 47, 51));
        txtScreen.setColumns(20);
        txtScreen.setForeground(new java.awt.Color(255, 255, 255));
        txtScreen.setRows(5);
        txtScreen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 170, 181), 3));
        jScrollPane2.setViewportView(txtScreen);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 550, 230));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 170, 181), 3));
        jScrollPane1.setAutoscrolls(true);

        panelPCB.setBackground(new java.awt.Color(44, 47, 51));
        panelPCB.setToolTipText("");

        javax.swing.GroupLayout panelPCBLayout = new javax.swing.GroupLayout(panelPCB);
        panelPCB.setLayout(panelPCBLayout);
        panelPCBLayout.setHorizontalGroup(
            panelPCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );
        panelPCBLayout.setVerticalGroup(
            panelPCBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panelPCB);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 330, 300));

        btnLoad.setBackground(new java.awt.Color(153, 170, 181));
        btnLoad.setText("Cargar Archivo");
        btnLoad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnLoad.setContentAreaFilled(false);
        btnLoad.setOpaque(true);
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 170, 40));

        btnExecute.setBackground(new java.awt.Color(153, 170, 181));
        btnExecute.setText("Ejecutar archivos");
        btnExecute.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btnExecute.setContentAreaFilled(false);
        btnExecute.setOpaque(true);
        btnExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecuteActionPerformed(evt);
            }
        });
        getContentPane().add(btnExecute, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 170, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Memoria");
        jLabel9.setToolTipText("");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 130, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cola de trabajo N2");
        jLabel8.setToolTipText("");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cola de trabajo N1");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("PCB's");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("N2");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 600, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("N1");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Teclado");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pantalla");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Disco Duro");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        workQueue2List.setBackground(new java.awt.Color(44, 47, 51));
        workQueue2List.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane9.setViewportView(workQueue2List);

        getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 190, 130));

        filesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Archivo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(filesTable);
        if (filesTable.getColumnModel().getColumnCount() > 0) {
            filesTable.getColumnModel().getColumn(0).setResizable(false);
            filesTable.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 170, 130));

        lbTiempoN2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTiempoN2.setForeground(new java.awt.Color(255, 255, 255));
        lbTiempoN2.setText("Tiempo Restante: --");
        getContentPane().add(lbTiempoN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 610, -1, -1));

        lbCursoN2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbCursoN2.setForeground(new java.awt.Color(255, 255, 255));
        lbCursoN2.setText("Instrucción en Curso: Ninguna");
        getContentPane().add(lbCursoN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, -1, -1));

        lbCursoN1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbCursoN1.setForeground(new java.awt.Color(255, 255, 255));
        lbCursoN1.setText("Instrucción en Curso: Ninguna");
        getContentPane().add(lbCursoN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 490, -1, -1));

        lbTiempoN1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTiempoN1.setForeground(new java.awt.Color(255, 255, 255));
        lbTiempoN1.setText("Tiempo Restante: --");
        getContentPane().add(lbTiempoN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 490, -1, -1));

        lblBackground.setBackground(new java.awt.Color(35, 39, 42));
        lblBackground.setForeground(new java.awt.Color(255, 255, 255));
        lblBackground.setOpaque(true);
        lblBackground.setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        Object rowData[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3" },
        { "Row2-Column1", "Row2-Column2", "Row2-Column3" },{ "Row1-Column1", "Row1-Column2", "Row1-Column3" },{ "Row1-Column1", "Row1-Column2", "Row1-Column3" },{ "Row1-Column1", "Row1-Column2", "Row1-Column3" },{ "Row1-Column1", "Row1-Column2", "Row1-Column3" }
        ,{ "Row1-Column1", "Row1-Column2", "Row1-Column3" },{ "Row1-Column1", "Row1-Column2", "Row1-Column3" },{ "Row1-Column1", "Row1-Column2", "Row1-Column3" },{ "Row1-Column1", "Row1-Column2", "Row1-Column3" },{ "Row1-Column1", "Row1-Column2", "Row1-Column3" },};
        Object columnNames[] = { "Column One", "Column Two", "Column Three" };
        JTable table = new JTable(rowData, columnNames);
        
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setSize(300,150);
        scrollPane.setLocation(0,y1);
        panelPCB.add(scrollPane);
        panelPCB.setPreferredSize(new Dimension(305, y2));
        panelPCB.validate();
        panelPCB.repaint();
        y1+=160;
        y2+=160;
        jScrollPane1.revalidate();
    }//GEN-LAST:event_btnNextActionPerformed
    List<String[]> selectedFiles = new ArrayList<String[]>();
    List<String[]> executedFiles = new ArrayList<String[]>();
    private void btnExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecuteActionPerformed
        int selectedRow[] = filesTable.getSelectedRows();
        System.out.println(Arrays.toString(selectedRow));
        if(selectedRow.length == 0){
            JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo");
        }else{
            for(int i=0;i<(selectedRow.length);i++){
                fileManager+=1;
                JLabel label = new JLabel();
                label.setText("PCB Archivo"+i);
                label.setFont(new Font("Segoe UI",Font.BOLD, 15));
                label.setForeground(Color.WHITE);
                System.out.println("SELECCIONADOOOO: "+selectedRow[i]);                
                executedFiles.add(selectedFiles.get(selectedRow[i]));
                //System.out.println("AHHHHHHH"+Arrays.toString(executedFiles.get(selectedRow[i])));
                Object rowData[][] = {{"PC",0},{"AC",0},{"IR","-------"},{"AX",0},{"BX",0},{"CX",0},{"DX",0}};
                Object columnNames[] = { "Dato", "Valor"};
                JTable table = new JTable(rowData, columnNames);
                tables.add(table);
                
                PCB controlBlock = new PCB(fileManager);
                controlBlocks.add(controlBlock);
                System.out.println("FILE: "+fileManager);
                
                JScrollPane scrollPane = new JScrollPane(table);
                scrollPane.setSize(300,135);
                scrollPane.setLocation(0,y1);
                panelPCB.add(label);
                panelPCB.add(scrollPane);
                panelPCB.setPreferredSize(new Dimension(305, y2));
                
                panelPCB.add(label);
                panelPCB.validate();
                panelPCB.repaint();
                y1+=160;
                y2+=160;
                jScrollPane1.revalidate();
            }         
            
        }
        
        //System.out.println("SELECCIONADOS: "+selectedFiles.size());
        modelMemory = new DefaultListModel<>();
        modelHARDMemory = new DefaultListModel<>();
        queue1Model = new DefaultListModel<>();
        queue2Model = new DefaultListModel<>();
        
        try {
            dataManagment.dataFromFiles(executedFiles);
        } catch (IOException ex) {
            Logger.getLogger(mainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<String> memoryInfo = dataManagment.memoryData;
        //System.out.println(Arrays.toString(memoryInfo));
        ArrayList<String> dataInfo = dataManagment.hardDData;
        
        for(int i=0;i<memoryInfo.size();i++){
            modelMemory.addElement((modelMemory.getSize()+1)+"."+memoryInfo.get(i));
        }
        
        listMemory.setModel(modelMemory);
        if(dataInfo.size()>0){
        for(int i=0;i<dataInfo.size();i++){
            modelHARDMemory.addElement((modelHARDMemory.getSize()+1)+"."+dataInfo.get(i));
        }
        listHARDMemory.setModel(modelHARDMemory);
        }
        
        
        
        ArrayList<String> queue1Info = dataManagment.firstQueueData;
        
        
        for(int i=0;i<queue1Info.size();i++){
            queue1Model.addElement((queue1Model.getSize()+1)+"."+queue1Info.get(i));
        }
        workQueue1List.setModel(queue1Model);
        ArrayList<String> queue2Info = dataManagment.secondQueueData;
        
        for(int i=0;i<queue2Info.size();i++){
            queue2Model.addElement((queue2Model.getSize()+1)+"."+queue2Info.get(i));
        }
        workQueue2List.setModel(queue2Model);
        
        
        fillN1();
        fillN2();
    }//GEN-LAST:event_btnExecuteActionPerformed
    /*private String getPC(int file,String instruction,ArrayList<Instruction> queue){
        int flag =0;
        String next="";
        for(int i=0;i<queue.size();i++){
            Instruction actual = queue.get(i);
            int actualFile = actual.fileNumber;
            String actualCommand = actual.command;
            if(flag==0&&(actualFile == file)&&(actualCommand.equals(instruction)))
                flag=1;
            if(flag==1)
        }
    }*/
    
    
    private void refreshTable(int file,String instruction){
        JTable actual = tables.get(file-1);
        PCB actualBlock = controlBlocks.get(file-1);
        Object rowData[][] = {{"PC",actualBlock.PC},{"AC",actualBlock.AC},{"IR",instruction},{"AX",actualBlock.AX},{"BX",actualBlock.BX},{"CX",actualBlock.CX},{"DX",actualBlock.DX}};
        Object columnNames[] = { "Dato", "Valor"};
        DefaultTableModel model = new DefaultTableModel(rowData,columnNames);
        actual.setModel(model);
    }
    
    int fileCounter=0;
    private void fillN1(){
        Nucleo1.getTableHeader().setReorderingAllowed(false);
        DefaultTableModel dtm = new DefaultTableModel(0, 0);
        
        String header[] = new String[dataManagment.firstQueueData.size()];
        for(int i = 0;i<dataManagment.firstQueueData.size();i++){
            header[i] = "Trabajo "+(i+1);
        }
        dtm.setColumnIdentifiers(header);
        Nucleo1.setModel(dtm);
        String works[] = new String[dataManagment.firstQueueData.size()];
        for(int i = 0;i<dataManagment.firstQueueData.size();i++){
            works[i] = dataManagment.firstQueueData.get(i);
        }
        dtm.addRow(works);
        if(nucleo1.estado == "En Espera"){
            startN1();
        }
    }
    
    
    
    private void startN1(){
        Thread t = new Thread(){
            public void run(){
                nucleo1.estado = "En Uso";
                InstructionConsultor guide = new InstructionConsultor(dataManagment.valuesWeights);
                for(int i = nucleo1.posInst;i<dataManagment.firstQueueData.size();i++){
                    jScrollPane1.revalidate();
                    nucleo1.posInst = i;
                    lbCursoN1.setText("Instrucción en Curso: "+(i+1)+". "+dataManagment.firstQueueData.get(i));
                    int timeWeight = guide.checkWeight(dataManagment.firstQueueData.get(i)) * 1000;
                    long initTime = System.currentTimeMillis();
                    
                    PCB actual= controlBlocks.get(dataManagment.firstQueueObjects.get(i).fileNumber-1);
                    actual.operation(dataManagment.firstQueueObjects.get(i).command);
                    checkJumpsN1(dataManagment.firstQueueData.get(i));
                    refreshTable(dataManagment.firstQueueObjects.get(i).fileNumber,dataManagment.firstQueueObjects.get(i).command);
                    jScrollPane1.revalidate();
                    while(System.currentTimeMillis()-initTime<timeWeight){
                       double tiempo = (timeWeight-(System.currentTimeMillis()-initTime))/1000 + 1;
                       lbTiempoN1.setText("Tiempo Restante: "+tiempo+" s");
                    }
                    if(guide.isInterrupt(dataManagment.firstQueueObjects, i) && nucleo2.estado != "En Interrupcion"){
                        lbTiempoN1.setText("Tiempo Restante: --");
                        nucleo1.estado = "En Interrupcion";
                        txtScreen.setText(txtScreen.getText()+guide.interruptionInfo(dataManagment.firstQueueData.get(i)));
                        break;
                    }
                    if(guide.isInterrupt(dataManagment.firstQueueObjects, i) && nucleo2.estado == "En Interrupcion"){
                        lbTiempoN1.setText("Tiempo Restante: --");
                        nucleo1.estado = "Esperando Interrupcion";
                        break;
                    }
                    
                }
                if(nucleo1.estado == "En Uso"){
                    lbCursoN1.setText("Instrucción en Curso: Ninguna");
                    lbTiempoN1.setText("Tiempo Restante: --");
                    nucleo1.estado = "En Espera";
                    nucleo1.posInst +=1;
                }
                Thread.currentThread().interrupt();
            }
        };
        t.start();
    }
    
    private void fillN2(){
        Nucleo2.getTableHeader().setReorderingAllowed(false);
        DefaultTableModel dtm = new DefaultTableModel(0, 0);
        
        String header[] = new String[dataManagment.secondQueueData.size()];
        for(int i = 0;i<dataManagment.secondQueueData.size();i++){
            header[i] = "Trabajo "+(i+1);
        }
        dtm.setColumnIdentifiers(header);
        Nucleo2.setModel(dtm);
        String works[] = new String[dataManagment.secondQueueData.size()];
        for(int i = 0;i<dataManagment.secondQueueData.size();i++){
            works[i] = dataManagment.secondQueueData.get(i);
        }
        dtm.addRow(works);
        if(nucleo2.estado == "En Espera"){
            startN2();
        }
    }
    
    private void startN2(){
        Thread t2 = new Thread(){
            public void run(){
                nucleo2.estado = "En Uso";
                InstructionConsultor guide = new InstructionConsultor(dataManagment.valuesWeights);
                for(int i = nucleo2.posInst;i<dataManagment.secondQueueData.size();i++){
                    jScrollPane1.revalidate();
                    nucleo2.posInst = i;
                    lbCursoN2.setText("Instrucción en Curso: "+(i+1)+". "+dataManagment.secondQueueData.get(i));
                    int timeWeight = guide.checkWeight(dataManagment.secondQueueData.get(i)) * 1000;
                    long initTime = System.currentTimeMillis();
                    PCB actual= controlBlocks.get(dataManagment.secondQueueObjects.get(i).fileNumber-1);
                    actual.operation(dataManagment.secondQueueObjects.get(i).command);
                    checkJumpsN2(dataManagment.secondQueueData.get(i));
                    refreshTable(dataManagment.secondQueueObjects.get(i).fileNumber,dataManagment.secondQueueObjects.get(i).command);
                    jScrollPane1.revalidate();
                    while(System.currentTimeMillis()-initTime<timeWeight){
                       double tiempo = (timeWeight-(System.currentTimeMillis()-initTime))/1000 + 1;
                       lbTiempoN2.setText("Tiempo Restante: "+tiempo+" s");
                    }
                    if(guide.isInterrupt(dataManagment.secondQueueObjects, i) && nucleo1.estado != "En Interrupcion"){
                        lbTiempoN2.setText("Tiempo Restante: --");
                        nucleo2.estado = "En Interrupcion";
                        txtScreen.setText(txtScreen.getText()+guide.interruptionInfo(dataManagment.secondQueueData.get(i)));
                        break;
                    }
                    if(guide.isInterrupt(dataManagment.secondQueueObjects, i) && nucleo1.estado == "En Interrupcion"){
                        lbTiempoN2.setText("Tiempo Restante: --");
                        nucleo2.estado = "Esperando Interrupcion";
                        break;
                    }
                }
                if(nucleo2.estado == "En Uso"){
                    lbCursoN2.setText("Instrucción en Curso: Ninguna");
                    lbTiempoN2.setText("Tiempo Restante: --");
                    nucleo2.estado = "En Espera";
                    nucleo2.posInst +=1;
                }
                Thread.currentThread().interrupt();
            }
        };
        t2.start();
    }
    
    private void checkJumpsN1(String instruction){
        String[] parts = instruction.split(" ");
        String command = parts[0];
        switch(command){
            case "JUMP":
                String act = parts[1];
                String num = act.substring(1, act.length());
                System.out.println(num);
                String type = act.substring(0,1);
                dataManagment.adaptationN1(Integer.parseInt(num),nucleo1.posInst);
                fillN1();
                break;
            default:
                break;
        }
    }
    
    private void checkJumpsN2(String instruction){
        String[] parts = instruction.split(" ");
        String command = parts[0];
        switch(command){
            case "JUMP":
                String act = parts[1];
                String num = act.substring(1, act.length());
                System.out.println(num);
                String type = act.substring(0,1);
                dataManagment.adaptationN2(Integer.parseInt(num),nucleo2.posInst);
                fillN2();
                break;
            default:
                break;
        }
    }
    
    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setMultiSelectionEnabled(true);
        FileFilter filter = new FileNameExtensionFilter("ASM Files","asm");
        fileChooser.setFileFilter(filter);
        fileChooser.showOpenDialog(this);
        File selected[] = fileChooser.getSelectedFiles();
        for (File selected1 : selected) {
            String fileName = selected1.getName();
            fileCounter +=1;                
            String[] row={Integer.toString(fileCounter),fileName};
            String[] completeFile={Integer.toString(fileCounter),fileName,selected1.getPath()};
            DefaultTableModel model = (DefaultTableModel) filesTable.getModel();
            model.addRow(row);
            selectedFiles.add(completeFile);
            filesTable.setModel(model);
        }        
    }//GEN-LAST:event_btnLoadActionPerformed

    private void txtKeyboardKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyboardKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            InstructionConsultor guide = new InstructionConsultor(dataManagment.valuesWeights);
            if(nucleo1.estado.equals("En Interrupcion")){
                nucleo1.posInst += 1;
                nucleo1.estado = "En Uso";
                startN1();
                if(nucleo2.estado.equals("Esperando Interrupcion")){
                    nucleo2.estado = "En Interrupcion";
                    txtScreen.setText(txtScreen.getText()+guide.interruptionInfo(dataManagment.secondQueueData.get(nucleo2.posInst)));
                }
            }
            if(nucleo2.estado.equals("En Interrupcion")){
                nucleo2.posInst += 1;
                nucleo2.estado = "En Uso";
                startN2();
                if(nucleo1.estado.equals("Esperando Interrupcion")){
                    nucleo1.estado = "En Interrupcion";
                    txtScreen.setText(txtScreen.getText()+guide.interruptionInfo(dataManagment.firstQueueData.get(nucleo1.posInst)));
                }
            }
        }
    }//GEN-LAST:event_txtKeyboardKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Nucleo1;
    private javax.swing.JTable Nucleo2;
    private javax.swing.JButton btnExecute;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnNext;
    private javax.swing.JTable filesTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lbCursoN1;
    private javax.swing.JLabel lbCursoN2;
    private javax.swing.JLabel lbTiempoN1;
    private javax.swing.JLabel lbTiempoN2;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JList<String> listHARDMemory;
    private javax.swing.JList<String> listMemory;
    private javax.swing.JPanel panelPCB;
    private javax.swing.JTextArea txtKeyboard;
    private javax.swing.JTextArea txtScreen;
    private javax.swing.JList<String> workQueue1List;
    private javax.swing.JList<String> workQueue2List;
    // End of variables declaration//GEN-END:variables
}
