<hr/>
<b>문제</b>
<br/>
<hr/>
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.<br/>
<hr/>
<hr/>
<b>입력</b>
<br/>
<hr/>
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.<br/>
둘째 줄부터 N개의 줄에는 수 주어진다.<br/>
이 수는 절댓값이 1,000보다 작거나 같은 정수이다.<br/>
수는 중복되지 않는다.<br/>
<hr/>
<br/>
<hr/>
<hr/>
<b>출력</b>
<br/>
<hr/>
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.<br/>
<hr/>
<br/>
<hr/>
<b>풀이</b>
<br/>
<hr/>
SortNumber1.java
<br/><br/>
<p>
첫 번째 수는 배열의 크기..
두번째 부터는 해당 배열에 들어갈 수들이 순차적으로 나오게 된다.
절대값이 1000보다 작거나 같은 정수이니 int배열을 이용하면 될 것으로 보인다.

<hr/>
<br/>
<hr/>
<hr/>
<b>풀이 후 정리</b>
<br/>
<hr/>
숏코딩 측면에서 Array.sort에 BufferedReader, StringBuilder를 이용한 방법이 가장 짧았으며</br>
속도 측면에선 카운팅 정렬이 가장 좋았다.</br>
다만 카운팅 정렬의 경우 비교해야할 수의 범위가 극단적으로 크다면 메모리 낭비가 된다.</br>
그렇기 때문에 그에 맞는 정렬 알고리즘을 써야하는대 퀵 정렬이나 병합 정렬등이 선호 된다.

구현 -> CountingSort.java

<hr/>
