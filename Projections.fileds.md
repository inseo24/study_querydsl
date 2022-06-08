### Projections.fields를 쓰다 생긴 일

Projection 별로 안 써봐서 잘은 모르는데 필요한 데이터만 뽑아오려고 썼다. 

생성자 방식이나 setter방식, field 직접 조회 방식이 있는데 생성자 방식은 타입만 맞으면 되는 것과 달리 나머지 2개는 멤버변수 이름이 다 일치해야 한다.

변경하고 싶으면 `as`("원하는 이름") 이런 식으로 변경해주면 된다. 

예를 들어, quantity를 DTO에서는 amount로 쓰고 싶다면

totalxxxx.quantity.`as`("amount") 이런 식으로 작성해주면 된다.


어쨌든 이것 때문에 오늘 이 글을 쓴 건 아니고 Projections.fields를 쓰다가 기본값이 안 들어가면 데이터 set이 안되는 문제가 있었다.

자바는 어떤지 잘 모르겠는데 코틀린에서는 Dto 클래스 생성자에 기본값을 안 넣어주니 에러가 났다.


딱 아래처럼 생성자에 기본값을 안 넣어주면 에러가 난다. (expression error? 여튼 데이터에 문제가 있다고 뜬다.)

```kotlin
class MyClass(
    val name: String,
    val age: Int,
)
```


이걸 수정해서 아래처럼 쓰면 잘 돌아간다.

```kotlin
class MyClass(
    val name: String = "",
    val age: Int = 0
)
```

뭐 val이든 뭐든 데이터가 있으면 알아서 잘 들어가니 기본값을 넣어주는게 좋은 것 같다.

원래는 dto를 Q 파일로 만들어서 @QueryProjection 과 함께 쓰려고 했는데, 불러온 데이터를 이용해 해당 테이블에 없는 데이터를 추가하려고 하니까 잘 안됐다. 

그래서 한 번 테이블에 있는 데이터만 뽑고 다시 랩핑하는 작업을 하려 했는데 그러다 보니 코드가 너저분해졌다. 

여튼 잘 해결 됐다. 