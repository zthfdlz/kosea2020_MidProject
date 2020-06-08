
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//https://github.com/zthfdlz/kosea2020_MidProject.git

public class programUI extends JFrame {
	
	JFrame Book = new JFrame("Book"); // 기본창
	
	JLabel staffNo = new JLabel("직원번호  "); 
	
	JTextField staffNoT = new JTextField(10); //
	
	JButton login = new JButton("로그인");
	
	
	JTabbedPane tabP = new JTabbedPane();
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
	
//	// p1 도서목록 탭 
//	
//	//장르선택창
//	JTextField Booksearch = new JTextField(); // 도서검색
//	JButton Bsearch = new JButton("도서검색");
//	JButton Bplus = new JButton("도서등록");
//	// 도서목록테이블 
//	
//	
//	//p2 회원정보 탭
//	
//	JTextField Usersearch = new JTextField(); 
//	JButton Ussearch = new JButton("회원검색");
//	JButton Usplus = new JButton("회원등록");
//	// 회원정보 테이블
//	
//	//p3 도서위치탭
//	
//	//p4 직원정보탭
//	JButton Stplus = new JButton("회원추가");
//	
	
	public programUI() {
		
		Book.setSize(900, 600);
		Book.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Book.setLayout(new FlowLayout(FlowLayout.LEFT));

		
		Book.add(staffNo);
		Book.add(staffNoT);
		Book.add(login);
		
		
		Book.setVisible(true);

		
		tabP.add("도서목록", p1);
		tabP.add("도서대여", p2);
		tabP.add("회원정보", p3);
		tabP.add("도서위치", p4);
		tabP.add("직원정보", p5);
		
		setSize(800, 600);
		
		Book.add(tabP);
		
		
		setLocationRelativeTo(null);
		tabP.setVisible(true);
		
	}

	
	public static void main(String[] args) {
		
		new programUI();


	}

}
