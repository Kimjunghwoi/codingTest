<b>문제</b>
<br/>
<hr/>


정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.<br/>

명령은 총 여섯 가지이다.<br/>

push X: 정수 X를 큐에 넣는 연산이다.<br/>
pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.<br/>
size: 큐에 들어있는 정수의 개수를 출력한다.<br/>
empty: 큐가 비어있으면 1, 아니면 0을 출력한다.<br/>
front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.<br/>
back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.<br/>
<hr/>
<hr/>
<b>입력</b>
<br/>
<hr/>
첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다.<br/> 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.<br/> 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다.<br/> 문제에 나와있지 않은 명령이 주어지는 경우는 없다.
<hr/>
<br/>
<b>풀이</b>
<br/>
<hr/>
queue.java
<br/><br/>
배열로 시도하다가.. Queue를 써서 처리했다.<br/>
입력 출력에 대한 예시를 자세히 보고도 push부분에 출력이 있는 걸로 생각하여 문제를 틀렸다.<br/>
이후 수정하여 테스트는 정상 진행된 걸로 보이나.. 시간 초과로 테스트 실패하였다.
<br/>
<hr/>