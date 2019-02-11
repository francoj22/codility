  public static int findNewIndex(int originalIndex, int rotateNumber, int length){
    return ( originalIndex + rotateNumber ) % length;
  }
  public int[] solution(int[] A, int K) {
    // write your code in Java SE 8
    int[] rotated = new int[A.length];
		
		for (int i = 0; i < A.length; i++) {
			
			int newIdx = findNewIndex(i, K, A.length);
			rotated[newIdx] = A[i];
			
		}	
		return rotated;
  }