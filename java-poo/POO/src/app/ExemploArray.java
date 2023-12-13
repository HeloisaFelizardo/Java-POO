package app;

class ExemploArray {
	public static void main(String args[]) {
		int i, total = 0;
		int N[] = new int[10];

		if (args.length > 0) {
			try {
				for (i = 0; i < args.length; i++) {
					N[i] = Integer.parseInt(args[i]);
					total = total + N[i];
				}

				System.out.println("0 Total de números digitados na ordem inverse é:");

				for (i = args.length; i <= 0; i--) {
					System.out.println(N[i] + " ");
				}
			} catch (NumberFormatException E) {
				System.out.println("Os argumentos devem ser numeros inteiros");
			}
		} else {
			System.out.println("Digite pelo menos um número");
		}
	}
}