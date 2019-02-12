function solution(A) {
  //A is the array 
  var len = A.length;
  
  //first we sort the array
  A.sort((a,b) => a -b);
  
  //then we compare with the array if id is missing
  for (var i=1; i <= len; i++) {
    if (A[i-1] !== i) return i;
    
  }
  
}

console.log(solution([1,2,5,3]));
