package business;

/**
 * thuat toan Floyd
 *
 */
public class Floyd {
	
	// so dinh cua do thi
	final static int N = 4;

	// ma tran ke
	final static int A[][] = new int[][] {
		{ 0, 5, 2, 1 },
		{ 5, 0, 0, 3 },
		{ 2, 0, 0, 4 },
		{ 1, 3, 4, 0 }
	};

	// gia tri max
	final static int MAX = Integer.MAX_VALUE;

	public static String ga(int a) {
		String station = null;
		switch (a) {
		case 0:
			station = "Kim Ma";
			break;
		case 1:
			station = "Pho Co";
			break;
		case 2:
			station = "Lang";
			break;
		case 3:
			station = "Le Duan";
			break;

		default:
			break;
		}
		return station;
	}

	public static void Result(int S[][], int D[][], int u, int v) {
		if (D[u][v] >= MAX) {
			System.out.println("Khong co duong di tu " + ga(u) + " den " + ga(v));
		} else {
			System.out.println("Duong di ngan nhat tu " + ga(u) + " den " + ga(v) + " la: " + D[u][v]);
			System.out.print("Duong di: " + ga(u));
			while (u != v) {
				System.out.print(" --> " + ga(S[u][v]));
				u = S[u][v];
			}
		}
	}

	public static void Floyds(int u, int v) {
		
		// ma tran do dai duong di ngan nhat va ma tran truy vet duong di
		int D[][] = new int[N][N];
		int S[][] = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i != j && A[i][j] == 0)
					A[i][j] = MAX;
			}
		}

		int i, j, k;
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++) {
				D[i][j] = A[i][j];
				if (D[i][j] == MAX)
					S[i][j] = 0;
				else
					S[i][j] = j;
			}
		}

		for (k = 0; k < N; k++) {
			for (i = 0; i < N; i++) {
				for (j = 0; j < N; j++) {
					if (D[i][k] != MAX && D[i][j] > (D[i][k] + D[k][j])) {
						D[i][j] = D[i][k] + D[k][j];
						S[i][j] = S[i][k];
					}
				}
			}
		}
		Result(S, D, u, v);
	}
}
