
public class TesteLacos2 {

	public static void main(String[] args) {

		for (int linha = 0; linha < 10; linha++) {

			for (int coluna = 0; coluna < 10; coluna++) {
				if (coluna > linha) {
					break;
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
		for (int linha = 0; linha < 10; linha++) {

			for (int coluna = 1; coluna < 11; coluna++) {
				if (coluna > linha) {
					break;
				} else {
					System.out.print(coluna);
				}
			}
			System.out.println();
		}
		
		for(int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if ( coluna > linha ) {
                    break;
                }
                System.out.print( coluna +1 );
            }
            System.out.println();
        }
	}
}
