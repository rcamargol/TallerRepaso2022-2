package co.edu.unbosque.View;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class Panelapellido extends JPanel {
	
	private JRadioButton A,B,C,D,E,F,G,H,I;
	private JRadioButton J,K,L,M,N,O,P,Q,R;
	private JRadioButton S,T,U,V,W,X1,Y1,Z;
	private ButtonGroup grupoletras;

	
	public Panelapellido() {
		
		setLayout(new GridLayout(9,5));
		inicializarComponentes();
		setVisible(true);
	}

	private void inicializarComponentes() {
		
		setBorder(new TitledBorder ("INGRESA TU PRIMERA LETRA DE TU PRIMER"
				                     + " APELLIDO"));
		grupoletras= new ButtonGroup();
			
		A = new JRadioButton();
		A.setText("A.../");
		A.setActionCommand("A");

		add(new JLabel());
		
		B = new JRadioButton();
		B.setText("B.../");

		add(new JLabel());
		
		C = new JRadioButton();
		C.setText("C.../");

		add(new JLabel());
				
		D = new JRadioButton();
		D.setText("D.../");
		
		E = new JRadioButton();
		E.setText("E.../");
		
		F = new JRadioButton();
		F.setText("F.../");
		
		G = new JRadioButton();
		G.setText("G.../");
		
		H = new JRadioButton();
		H.setText("H.../");
		
		I = new JRadioButton();
		I.setText("I.../");

		
		
		add(A);
		add(new JLabel());
		add(B);
		add(new JLabel());
		add(C);
		add(new JLabel());
		add(D);
		add(new JLabel());
		add(E);
		add(new JLabel());
		add(F);
		add(new JLabel());
		add(G);
		add(new JLabel());
		add(H);
		add(new JLabel());
		add(I);
		add(new JLabel());
		
		J = new JRadioButton();
		J.setText("J.../");
		
		K = new JRadioButton();
		K.setText("K.../");
		
		L = new JRadioButton();
		L.setText("L.../");
		
		M = new JRadioButton();
		M.setText("M.../");
		
		N = new JRadioButton();
		N.setText("N.../");
		
		O = new JRadioButton();
		O.setText("O.../");
		
		P = new JRadioButton();
		P.setText("P.../");

		Q = new JRadioButton();
		Q.setText("Q.../");

		R = new JRadioButton();
		R.setText("R.../");

		
		add(J);
		add(new JLabel());
		add(K);
		add(new JLabel());
		add(L);
		add(new JLabel());
		add(M);
		add(new JLabel());
		add(N);
		add(new JLabel());
		add(O);
		add(new JLabel());
		add(P);
		add(new JLabel());
		add(Q);
		add(new JLabel());
		add(R);
		add(new JLabel());
		
		S = new JRadioButton();
		S.setText("S.../");

		T = new JRadioButton();
		T.setText("T.../");
	
		U = new JRadioButton();
		U.setText("U.../");
	
		V = new JRadioButton();
		V.setText("V.../");
	
		W = new JRadioButton();
		W.setText("W.../");
	
		X1 = new JRadioButton();
		X1.setText("X.../");

		Y1 = new JRadioButton();
		Y1.setText("Y.../");

		Z = new JRadioButton();
		Z.setText("Z.../");
		
		add(S);
		add(new JLabel());
		add(T);
		add(new JLabel());
		add(U);
		add(new JLabel());
		add(V);
		add(new JLabel());
		add(W);
		add(new JLabel());
		add(X1);
		add(new JLabel());
		add(Y1);
		add(new JLabel());
		add(Z);
		
		grupoletras.add(A);
		grupoletras.add(B);
		grupoletras.add(C);
		grupoletras.add(D);
		grupoletras.add(E);
		grupoletras.add(F);
		grupoletras.add(G);
		grupoletras.add(H);
		grupoletras.add(I);
		grupoletras.add(J);
		grupoletras.add(K);
		grupoletras.add(L);
		grupoletras.add(M);
		grupoletras.add(N);
		grupoletras.add(O);
		grupoletras.add(P);
		grupoletras.add(Q);
		grupoletras.add(R);
		grupoletras.add(S);
		grupoletras.add(T);
		grupoletras.add(U);
		grupoletras.add(V);
		grupoletras.add(W);
		grupoletras.add(X1);
		grupoletras.add(Y1);
		grupoletras.add(Z);
		
	}

	public JRadioButton getJ() {
		return J;
	}

	public void setJ(JRadioButton j) {
		J = j;
	}

	public JRadioButton getK() {
		return K;
	}

	public void setK(JRadioButton k) {
		K = k;
	}

	public JRadioButton getL() {
		return L;
	}

	public void setL(JRadioButton l) {
		L = l;
	}

	public JRadioButton getM() {
		return M;
	}

	public void setM(JRadioButton m) {
		M = m;
	}

	public JRadioButton getN() {
		return N;
	}

	public void setN(JRadioButton n) {
		N = n;
	}

	public JRadioButton getO() {
		return O;
	}

	public void setO(JRadioButton o) {
		O = o;
	}

	public JRadioButton getP() {
		return P;
	}

	public void setP(JRadioButton p) {
		P = p;
	}

	public JRadioButton getQ() {
		return Q;
	}

	public void setQ(JRadioButton q) {
		Q = q;
	}

	public JRadioButton getR() {
		return R;
	}

	public void setR(JRadioButton r) {
		R = r;
	}

	public JRadioButton getS() {
		return S;
	}

	public void setS(JRadioButton s) {
		S = s;
	}

	public JRadioButton getT() {
		return T;
	}

	public void setT(JRadioButton t) {
		T = t;
	}

	public JRadioButton getU() {
		return U;
	}

	public void setU(JRadioButton u) {
		U = u;
	}

	public JRadioButton getV() {
		return V;
	}

	public void setV(JRadioButton v) {
		V = v;
	}

	public JRadioButton getW() {
		return W;
	}

	public void setW(JRadioButton w) {
		W = w;
	}

	public JRadioButton getZ() {
		return Z;
	}

	public void setZ(JRadioButton z) {
		Z = z;
	}

	public JRadioButton getA() {
		return A;
	}

	public void setA(JRadioButton a) {
		A = a;
	}

	public JRadioButton getB() {
		return B;
	}

	public void setB(JRadioButton b) {
		B = b;
	}

	public JRadioButton getC() {
		return C;
	}

	public void setC(JRadioButton c) {
		C = c;
	}

	public JRadioButton getD() {
		return D;
	}

	public void setD(JRadioButton d) {
		D = d;
	}

	public JRadioButton getE() {
		return E;
	}

	public void setE(JRadioButton e) {
		E = e;
	}

	public JRadioButton getF() {
		return F;
	}

	public void setF(JRadioButton f) {
		F = f;
	}

	public JRadioButton getG() {
		return G;
	}

	public void setG(JRadioButton g) {
		G = g;
	}

	public JRadioButton getH() {
		return H;
	}

	public void setH(JRadioButton h) {
		H = h;
	}

	public JRadioButton getI() {
		return I;
	}

	public void setI(JRadioButton i) {
		I = i;
	}

	public JRadioButton getX1() {
		return X1;
	}

	public void setX1(JRadioButton x1) {
		X1 = x1;
	}

	public JRadioButton getY1() {
		return Y1;
	}

	public void setY1(JRadioButton y1) {
		Y1 = y1;
	}
}
