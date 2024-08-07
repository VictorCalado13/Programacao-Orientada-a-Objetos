/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author vcala
 */
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class CadastroInterface extends javax.swing.JFrame {
private Cliente c = new Cliente();
private BDsistema bsis = new BDsistema();
    /**
     * Creates new form CadastroInterface
     */
    public CadastroInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CadastroCliente_txt = new javax.swing.JLabel();
        DadosBásicos_txt = new javax.swing.JLabel();
        NomeC_txt = new javax.swing.JLabel();
        Idade_txt = new javax.swing.JLabel();
        CPF_txt = new javax.swing.JLabel();
        Endereco_txt = new javax.swing.JLabel();
        NomeC_box = new javax.swing.JTextField();
        Endereco_box = new javax.swing.JTextField();
        Cidade_txt = new javax.swing.JLabel();
        Cidade_box = new javax.swing.JTextField();
        OndeConsumir_txt = new javax.swing.JLabel();
        OndeConsumir_ComboBox = new javax.swing.JComboBox<>();
        ProdutosEscolh_txt = new javax.swing.JLabel();
        Idade_box = new javax.swing.JTextField();
        CPF_box = new javax.swing.JTextField();
        FormaPagamento_txt = new javax.swing.JLabel();
        Cadastrar_BT = new javax.swing.JButton();
        ProdutosEscolh_ComboBox = new javax.swing.JComboBox<>();
        FormaPagamento_box = new javax.swing.JTextField();
        Consultar_BT = new javax.swing.JButton();
        ScrollTab = new javax.swing.JScrollPane();
        TabelaD = new javax.swing.JTable();
        Att_BT = new javax.swing.JButton();
        Excluir_BT = new javax.swing.JButton();
        DadosRegis_txt = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CadastroCliente_txt.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        CadastroCliente_txt.setText("Cadastro do Cliente");

        DadosBásicos_txt.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        DadosBásicos_txt.setText("Dados básicos:");

        NomeC_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NomeC_txt.setText("Nome Completo*:");

        Idade_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Idade_txt.setText("Idade*:");

        CPF_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CPF_txt.setText("CPF*:");

        Endereco_txt.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        Endereco_txt.setText("Endereço:");

        NomeC_box.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        NomeC_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeC_boxActionPerformed(evt);
            }
        });

        Endereco_box.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Cidade_txt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cidade_txt.setText("Cidade*:");

        Cidade_box.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        OndeConsumir_txt.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        OndeConsumir_txt.setText("Onde irá consumir ?");

        OndeConsumir_ComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OndeConsumir_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Estabelecimento" }));
        OndeConsumir_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OndeConsumir_ComboBoxActionPerformed(evt);
            }
        });

        ProdutosEscolh_txt.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        ProdutosEscolh_txt.setText("Informe os produtos escolhidos:");

        Idade_box.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Idade_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Idade_boxActionPerformed(evt);
            }
        });

        CPF_box.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CPF_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPF_boxActionPerformed(evt);
            }
        });

        FormaPagamento_txt.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        FormaPagamento_txt.setText("Qual a forma de Pagamento ?");

        Cadastrar_BT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cadastrar_BT.setText("Cadastrar");
        Cadastrar_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cadastrar_BTActionPerformed(evt);
            }
        });

        ProdutosEscolh_ComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ProdutosEscolh_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pizza s/ Borda", "Pizza c/ Borda", "Coca Cola" }));

        FormaPagamento_box.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        FormaPagamento_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormaPagamento_boxActionPerformed(evt);
            }
        });

        Consultar_BT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Consultar_BT.setText("Consultar");
        Consultar_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar_BTActionPerformed(evt);
            }
        });

        TabelaD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TabelaD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Idade", "Endereço", "Cidade", "Pagamento"
            }
        ));
        ScrollTab.setViewportView(TabelaD);

        Att_BT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Att_BT.setText("Atualizar");
        Att_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Att_BTActionPerformed(evt);
            }
        });

        Excluir_BT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Excluir_BT.setText("Excluir");
        Excluir_BT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Excluir_BTActionPerformed(evt);
            }
        });

        DadosRegis_txt.setFont(new java.awt.Font("Tahoma", 0, 23)); // NOI18N
        DadosRegis_txt.setText("Dados Registrados:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CadastroCliente_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Idade_txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Idade_box, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NomeC_txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NomeC_box, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CPF_txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CPF_box, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(ScrollTab, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(Endereco_box, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(Cidade_txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cidade_box, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ProdutosEscolh_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(OndeConsumir_txt)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(OndeConsumir_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16)))
                            .addComponent(ProdutosEscolh_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DadosBásicos_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(185, 185, 185)
                                .addComponent(DadosRegis_txt))
                            .addComponent(Endereco_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FormaPagamento_txt)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cadastrar_BT, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(Consultar_BT, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(Att_BT)
                                .addGap(81, 81, 81)
                                .addComponent(Excluir_BT, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FormaPagamento_box, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(CadastroCliente_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DadosBásicos_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(DadosRegis_txt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomeC_txt)
                            .addComponent(NomeC_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Idade_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Idade_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CPF_txt)
                            .addComponent(CPF_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(ScrollTab, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(Endereco_txt)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cidade_txt)
                    .addComponent(Cidade_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Endereco_box, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ProdutosEscolh_txt)
                .addGap(18, 18, 18)
                .addComponent(ProdutosEscolh_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OndeConsumir_txt)
                    .addComponent(OndeConsumir_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(FormaPagamento_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FormaPagamento_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cadastrar_BT)
                    .addComponent(Consultar_BT)
                    .addComponent(Excluir_BT)
                    .addComponent(Att_BT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OndeConsumir_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OndeConsumir_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OndeConsumir_ComboBoxActionPerformed

    private void Idade_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Idade_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Idade_boxActionPerformed

    private void CPF_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPF_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPF_boxActionPerformed

    private void NomeC_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeC_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeC_boxActionPerformed

    private void Cadastrar_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cadastrar_BTActionPerformed
        cadastroC();
        listaTabela();
    }//GEN-LAST:event_Cadastrar_BTActionPerformed

    private void FormaPagamento_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormaPagamento_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormaPagamento_boxActionPerformed

    private void Consultar_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar_BTActionPerformed
        consultarcli();
    }//GEN-LAST:event_Consultar_BTActionPerformed

    private void Att_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Att_BTActionPerformed
        atualizarcli();
        listaTabela();
    }//GEN-LAST:event_Att_BTActionPerformed

    private void Excluir_BTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Excluir_BTActionPerformed
        excluir();
        listaTabela();
    }//GEN-LAST:event_Excluir_BTActionPerformed
    public void cadastroC (){
      Cliente clien = new Cliente();
      try{
          clien.setNome(NomeC_box.getText());
          clien.setIdade(Integer.parseInt(Idade_box.getText()));
          clien.setCpf(Long.parseLong(CPF_box.getText()));
          clien.setEndereco(Endereco_box.getText());
          clien.setCidade(Cidade_box.getText());
          clien.PedidoMenu().equals(ProdutosEscolh_ComboBox.getSelectedItem());
          clien.EntrMenu().equals(OndeConsumir_ComboBox.getSelectedItem());
          clien.setPagamento(FormaPagamento_box.getText());
          clien = bsis.cadCli(clien);
          if(clien != null){
              JOptionPane.showMessageDialog(null,"Cadastro realizado com Sucesso","Cadastro",JOptionPane.INFORMATION_MESSAGE);
              clean();
             
          }
          else{
              
              JOptionPane.showMessageDialog(null,"Este CPF ja foi cadastrado","Cpf ja cadastrado",0);
              CPF_box.setText("");
              CPF_box.requestFocus();
          }
      }
      catch (NumberFormatException nfe){
          JOptionPane.showMessageDialog(null,"ERROR!!! Informe apenas numeros","ERRO",0);
          NomeC_box.requestFocus();
      }
    } 
    
    public void clean(){
        NomeC_box.setText("");
        Idade_box.setText("");
        CPF_box.setText("");
        Endereco_box.setText("");
        Cidade_box.setText("");
        FormaPagamento_box.setText("");
        
        
        
    }
    
    public void consultarcli(){
         Cliente clien = new Cliente();
      try{
          clien.setCpf(Long.parseLong(CPF_box.getText()));
          clien = bsis.impCliNum(clien);
          if(clien != null){
            NomeC_box.setText(clien.getNome());
            Idade_box.setText(Integer.toString(clien.getIdade()));
            CPF_box.setText(Long.toString(clien.getCpf()));
            Endereco_box.setText(clien.getEndereco());
            Cidade_box.setText(clien.getCidade());
            FormaPagamento_box.setText(clien.getPagamento());
          clien = bsis.cadCli(clien);
              JOptionPane.showMessageDialog(null,"Verifique os Dados","Verificação",JOptionPane.INFORMATION_MESSAGE);
              clean();
              
          }
 
          else{
              
              JOptionPane.showMessageDialog(null,"CPF não encontrado ","Cpf nao encontrado",0);
              CPF_box.setText("");
              CPF_box.requestFocus();
          }
      }
      catch (NumberFormatException nfe){
          JOptionPane.showMessageDialog(null,"ERROR!!! Informe apenas numeros","ERRO",0);
          NomeC_box.requestFocus();
      }
      
    }
    
     public void atualizarcli(){
         Cliente clien = new Cliente();
      try{
          clien.setCpf(Long.parseLong(CPF_box.getText()));
          clien = bsis.alteraClienteNum(clien);
          if(clien != null){
            NomeC_box.setText(clien.getNome());
            Idade_box.setText(Integer.toString(clien.getIdade()));
            CPF_box.setText(Long.toString(clien.getCpf()));
            Endereco_box.setText(clien.getEndereco());
            Cidade_box.setText(clien.getCidade());
            FormaPagamento_box.setText(clien.getPagamento());
            
              JOptionPane.showMessageDialog(null,"Atualização finalizada com Sucesso","Atualização",JOptionPane.INFORMATION_MESSAGE);
              clean();
              
          }
 
          else{
              
              JOptionPane.showMessageDialog(null,"CPF não encontrado ","Cpf nao encontrado",0);
              CPF_box.setText("");
              CPF_box.requestFocus();
          }
      }
      catch (NumberFormatException nfe){
          JOptionPane.showMessageDialog(null,"ERROR!!! Informe apenas numeros","ERRO",0);
          NomeC_box.requestFocus();
      }
      
    }
      public void excluir(){
         Cliente clien = new Cliente();
         int escolha;
      try{
          clien.setCpf(Long.parseLong(CPF_box.getText()));
          clien = bsis.impCliNum(clien);
          if(clien != null){
            NomeC_box.setText(clien.getNome());
            Idade_box.setText(Integer.toString(clien.getIdade()));
            CPF_box.setText(Long.toString(clien.getCpf()));
            Endereco_box.setText(clien.getEndereco());
            Cidade_box.setText(clien.getCidade());
            FormaPagamento_box.setText(clien.getPagamento());
            escolha = JOptionPane.showConfirmDialog(null,"Você tem certeza que deseja excluir ?","Exclusão",JOptionPane.YES_NO_OPTION);
            if(escolha == 0){
                bsis.removeClienteNum(clien);
                 JOptionPane.showMessageDialog(null,"Cliente excluido com sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
              clean();
                
            }
          }
 
          else{
              
              JOptionPane.showMessageDialog(null,"CPF não encontrado ","Cpf nao encontrado",0);
              CPF_box.setText("");
              CPF_box.requestFocus();
          }
      }
      catch (NumberFormatException nfe){
          JOptionPane.showMessageDialog(null,"ERROR!!! Informe apenas numeros","ERRO",0);
          NomeC_box.requestFocus();
      }
      
    }
     
    public void listaTabela(){

            DefaultTableModel modelo = (DefaultTableModel)TabelaD.getModel();
            int linha = 0;

            modelo.setRowCount(linha);
            for(Cliente clien : bsis.getBdCli()){

                modelo.insertRow(linha,new Object[]{clien.getNome(),clien.getIdade(),clien.getEndereco(),clien.getCidade(),clien.getPagamento()});
                linha++;

            }
    }
    
    
    
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
            java.util.logging.Logger.getLogger(CadastroInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Att_BT;
    private javax.swing.JTextField CPF_box;
    private javax.swing.JLabel CPF_txt;
    private javax.swing.JButton Cadastrar_BT;
    private javax.swing.JLabel CadastroCliente_txt;
    private javax.swing.JTextField Cidade_box;
    private javax.swing.JLabel Cidade_txt;
    private javax.swing.JButton Consultar_BT;
    private javax.swing.JLabel DadosBásicos_txt;
    private javax.swing.JLabel DadosRegis_txt;
    private javax.swing.JTextField Endereco_box;
    private javax.swing.JLabel Endereco_txt;
    private javax.swing.JButton Excluir_BT;
    private javax.swing.JTextField FormaPagamento_box;
    private javax.swing.JLabel FormaPagamento_txt;
    private javax.swing.JTextField Idade_box;
    private javax.swing.JLabel Idade_txt;
    private javax.swing.JTextField NomeC_box;
    private javax.swing.JLabel NomeC_txt;
    private javax.swing.JComboBox<String> OndeConsumir_ComboBox;
    private javax.swing.JLabel OndeConsumir_txt;
    private javax.swing.JComboBox<String> ProdutosEscolh_ComboBox;
    private javax.swing.JLabel ProdutosEscolh_txt;
    private javax.swing.JScrollPane ScrollTab;
    private javax.swing.JTable TabelaD;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
