<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  
</head>

<body>
    <h1>숫자 야구 게임</h1>
    <h2></h2>
<h3>> 개요 </h3>
    <pre>실행 순서
	Main -> Biginnig</span> 0, 1, 2, 3 중 하나를 입력 받고 다시 -> Main <br>
	-> 0: 자리수 설정, 숫자 3, 4, 5를 입력 받음. 
		3: -> PlayGame || 4: -> PlayLevel4 || 5: -> PlayLevel5 <br>
	-> 1: 자리수3으로 게임 시작. <span style="color:blue"> -> PlayGame</span>(위에서 자리수 3을 입력 받을 때와 동일)<br>
	-> 2, 3: 종료</pre>
    <p> 
    PlayGame -> MakeNumber -> InputNumber -> MatchNumber...<br>
    어떤 자리수로 게임을 시작하든 동일한 흐름으로 진행되기에 위에서 진행 순서를 하나만 서술함. <br></p>
    <h3>> 클래스 별 역할</h3>
    <pre> 
    PlayGame, PlayLevel4, PlayLevel5 : MakeNumber로부터 정답 숫자 받음, InputNumber로부터 입력 숫자 받음, 
	    				이 둘을 MatchNumber의 operate 메서드로 비교 실행, 이 과정을 반복,
                                        게임 1회 이후 1. 게임 다시 하기 2. 게임 기록 보기 3. 종료하기 중 택 일,
	    				게임 판수(gameCounts)를 GameRecord에 전달.
    MakeNumber, MakeNumber4,MakeNumber5 : 정답 숫자 생성 후 위 Play...에 전달.
    InputNumber, InputNumber4, InputNumber5 : 입력 숫자의 적합성 판단 후 위 Play...에 전달.
    MatchNumber, MatchNumber4, MatchNumber5 : 정답 숫자와 입력 숫자 비교, 
	    				      정답을 맞추기까지의 입력 시도 횟수(trialCounts)를 GameRecord에 전달
    GameRecord : 전달 받은 게임 판수(gameCounts)와 입력 시도 횟수(trialCounts)를 기록 및 출력 </pre>
    

<h3>> 도전 레벨 별 요구사항 및 트러블 슈팅 기록 </h3>
<pre>
Lv1- https://tes1194.tistory.com/26 
Lv2- https://tes1194.tistory.com/27 
Lv3- https://tes1194.tistory.com/29
Lv4- https://tes1194.tistory.com/33</pre>
   
    
</body>

</html>
