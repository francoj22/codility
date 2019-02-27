console.log(solution([1, 3, 6, 4, 1, 2]));

function isPositive(value) {
   return value > -1;
}

function solution(A) {
  let samallestInputInt = 1;
  A.sort((a, b) => {
    return a - b;
  })
  
  for (let index = 0; index < A.length; index++) {
    let element = A[index];
    if(isPositive(element) && element === samallestInputInt) 
      samallestInputInt++;
  }
  return samallestInputInt;

}
