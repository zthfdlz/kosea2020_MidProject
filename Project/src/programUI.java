
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//https://github.com/zthfdlz/kosea2020_MidProject.git

public class programUI extends JFrame {
	
	JFrame Book = new JFrame("Book"); // �⺻â
	
	JLabel staffNo = new JLabel("������ȣ  "); 
	
	JTextField staffNoT = new JTextField(10); //
	
	JButton login = new JButton("�α���");
	
	
	JTabbedPane tabP = new JTabbedPane();
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	
//	// p1 ������� �� 
//	
//	//�帣����â
//	JTextField Booksearch = new JTextField(); // �����˻�
//	JButton Bsearch = new JButton("�����˻�");
//	JButton Bplus = new JButton("�������");
//	// ����������̺� 
//	
//	
//	//p2 ȸ������ ��
//	
//	JTextField Usersearch = new JTextField(); 
//	JButton Ussearch = new JButton("ȸ���˻�");
//	JButton Usplus = new JButton("ȸ�����");
//	// ȸ������ ���̺�
//	
//	//p3 ������ġ��
//	
//	//p4 ����������
//	JButton Stplus = new JButton("ȸ���߰�");
//	
	
	public programUI() {
		
		Book.setSize(900, 600);
		Book.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Book.setLayout(new FlowLayout(FlowLayout.LEFT));

		
		Book.add(staffNo);
		Book.add(staffNoT);
		Book.add(login);
		
		
		Book.setVisible(true);

		
		tabP.add("�������", p1);
		tabP.add("�����뿩", p2);
		tabP.add("ȸ������", p3);
		tabP.add("������ġ", p4);
		tabP.add("��������", p5);
		
		setSize(800, 600);
		
		Book.add(tabP);
		
		
		setLocationRelativeTo(null);
		tabP.setVisible(true);
		
	}

	
	public static void main(String[] args) {
		
		new programUI();


	}

}
