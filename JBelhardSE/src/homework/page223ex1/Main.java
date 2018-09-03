package homework.page223ex1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Strings");
		Strings uno = new Strings();
		Strings dos = new Strings();
		uno.s = uno.create();
		uno.arr = uno.createChArr();
		uno.showOne();
		dos.s = dos.create();
		uno.sum((Arithmetic) dos);
		uno.compare((Arithmetic) dos);
		System.out.println("Vectors");
		Vector tres = new Vector();
		Vector cuatro = new Vector();
		tres.vec = tres.create();
		tres.show();
		cuatro.vec = cuatro.create();
		cuatro.show();
		tres.compareLength(cuatro);
		tres.sum((Arithmetic) cuatro);
		tres.compare((Arithmetic) cuatro);
		System.out.println("Matrix");
		Matrix cinco = new Matrix();
		cinco.arr = cinco.create();
		cinco.show();
		cinco.showOne();
		Matrix seis = new Matrix();
		seis.arr = cinco.toMin(2);
		seis.show();
		cinco.sum((Arithmetic) seis);
		cinco.compare((Arithmetic) seis);
		Matrix siete = new Matrix();
		siete.arr = siete.create();
		siete.show();
		cinco.sum((Arithmetic) siete);
		cinco.compare((Arithmetic) siete);
	}
}