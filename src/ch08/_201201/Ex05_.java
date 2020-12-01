package ch08._201201;

class UnsupportFunctionException extends RuntimeException {
	private final int ERR_CODE;

	UnsupportFunctionException(String message, int errCode) {
		super(message);
		this.ERR_CODE = errCode;
	}

	public int getErrCode() {
		return ERR_CODE;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage() + "(" + ERR_CODE + ")";
	}
}

public class Ex05_ {
	public static void main(String[] args) {
		try {
			throw new UnsupportFunctionException("지원하지 않는 기능입니다.", 200);
		} catch (UnsupportFunctionException e) {
			System.out.println(e.getMessage());	// getMessage()를 쓰는 게 낫다.
			System.out.println(e.getErrCode());
		}
	}
}
