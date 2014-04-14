public class Test_ServerClient {
	public static void main(final String[] args) {

		Thread serverThread = new Thread() {
			public void run() {
				try {
					Bob.main(args);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread clientThread = new Thread() {
			public void run() {
				try {
					Alice.main(args);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		serverThread.start();

		try {
			Thread.sleep(010000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		clientThread.start();
	}
}