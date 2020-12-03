package ch09._201202;

class Sample {
	int num;

	@Override
	public String toString() {
		return Integer.toString(num);
	}
}

public class Ex01_ {
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.num = 99;
		System.out.println(sample);

		try {

			// throws ClassNotFoundException
			Class c = Class.forName("ch09._201202.Sample");

			// throws InstantiationException, IllegalAccessException
			Sample e = (Sample) c.newInstance();
			e.num = 10;
			System.out.println(e);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}
}
