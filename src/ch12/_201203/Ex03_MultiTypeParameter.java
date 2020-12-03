package ch12._201203;

// ���׸� <T,M>�� ��� ���ڰ� �����ϳ�, �ַ� ���� �빮�� �ѱ��ڸ� ��

class Product<T, M> {
	private T kind;
	private M model;

	public T getKind() {
		return this.kind;
	}

	public M getModel() {
		return this.model;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}

	public void setModel(M model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return kind + " : " + model;
	}
}

class Car {
	@Override
	public String toString() {
		return "Car";
	}
}

class Tv {
	@Override
	public String toString() {
		return "Tv";
	}
}

public class Ex03_MultiTypeParameter {
	public static void main(String[] args) {

		Product<Tv, String> product1 = new Product<Tv, String>();
		product1.setKind(new Tv());
		product1.setModel("SmartTV");
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();

		Product<Car, String> product2 = new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("Diesel");
		Car car = product2.getKind();
		String carModel = product2.getModel();

		System.out.println(product1);
		System.out.println(product2);

	}
}
