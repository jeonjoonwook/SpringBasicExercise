# SpringBasicExercise
스프링 핵심원리 인프런 강의 정리 


스프링의 핵심  
 -  java 기반의 스프링은 좋은 객체 지향 어플리케이션을 개발할 수 있게 도와준다.  

객체 지향 특징  
 - 추상화, 캡슐화 , 상속 , 다형성  

객체 지향 프로그래밍  
 - 컴퓨터 프로그램을  명령어의 목록으로 보는 시각에서 벗어나 여러개의 독립된 단위, 즉 "객체" 들의 모임으로 파악함, 각각의 객체는 메시지를 주고받고, 데이터를 처리  
 - 객체 지향 프로그래밍은 프로그램을 유연하고 변경이 용이하게 만듬   

다형성  
 -역할과 구현을 분리 한다.  
 -역할과 구현으로 구분하면 세상이 단순해지고, 유연해지며 변경도 편리  
 
장점
 -클라이언트는 대상의 역할(인터페이스)만 알면 된다.  
 -클라이언트는 구현 대상의 내부 구조를 몰라도 된다.  
 -클라이언트는 내부 구조가 변경되어도 영향을 받지 않는다.  
 -클라이언트는 구현 대상 자체를 변경해도 영향을 받지 않는다.  

자바의 다형성  
 - 역할 : 인터페이스   구현 : 인터페이스를 구현한 클래스, 구현 객체  
 - 객체를 설계할 때 역할과 구현을 명확히 분리  
 - 객체 설계시 역할(인터페이스)를 먼저 부여하고, 그 역할을 수행하는 구현 객체 만들기  

오버라이딩  
 - 다형성을 자바 문법인 오버라이딩으로 구현함  
 - 부모 객체는 interface로 선언만 하고 내용은 implements를 사용하여 자식이 오버라이딩 하여 재정의 한다.  
 - 오버라이딩 된 메서드가 실행됨  

다형성의 본질
 - 인터페이스를 구현한 객체 인스턴스를 실행 시점에 유연하게 변경할 수 있다.  
 - 클라이언트를 변경하지 않고, 서버의 구현 기능을 유연하게 변경할 수 있다.  

SOLID 객체 지향 설계의 5가지 원칙  
 -SRP : 단일 책임 원칙 (single responsibility principle)  
 -OCP : 개방-폐쇄 원칙 (open/closed principle)  
 -LSP : 리스코프 치환 원칙 (Liskov substitution principle)  
 -ISP : 인터페이스 분리 원칙 (Interface segregation principle)  
 -DIP : 의존관계 연전 원칙 (Dependency inversion principle)  
 
SRP 단일 책임 원칙  
 -한 클래스는 하나의 책임만 가져야 한다.  
 -중요한 기준은 변경이다. 변경이 있을 때 파급 효과가 적으면 단일 책임 원칙을 잘 따른것  

OCP 개방-폐쇄 원칙    
 - 소프트웨어 요소는 확장에는 열려 있으나 변경에는 닫혀 있어야 한다.  
 - 확장 할때는 인터페이스를 구현한 새로운 클래스를 하나 만들어 새로운 기능을 구현하는 형식으로 확장  

OCP 위반 코드 - 클라이언트가 구현 클래스를 직접 선택  
- 구현 객체를 변경하려면 클라이언트 코드를 변경해야 하는 문제  
- 다형성을 사용했지만 OCP 원칙을 지킬수 없음  
- 객체를 생성하고, 연관관계를 맺어주는 변도의 조립 , 설정자가 필요  

LSP 리스코프 치환 원칙  
 - 부모 클래스의 인스턴스를 사용하는 위치에 자식 클래스의 인스턴스를 대신 사용했을 때 코드가 원래 의도대로 작동해야 한다.  
 - 자식 클래스의 인스턴스가 부모 클래스의 인스턴스의 행동범위안에서 행동해야 한다.   
 - 다형성에서 하위 클래스는 인터페이스 규약을 다 지켜야 한다.  

ISP 인터페이스 분리 원칙   
 - 특정 클라이언트를 위한 인터페이스 여러 개가 범용 인터페이스 하나보다 낫다.  
 - ex) 자동차 인터페이스 -> 운전 인터페이스, 정비 인터페이스로 분리  
 - 분리하면 어느 하나의 인터페이스 자체가 변해도 클라리언트에 영향을 주지 않는다.  
 - 인터페이스가 명확해지고, 대체 가능성이 높아짐  

DIP 의존관계 역전 원칙  
 - 프로그래머는 추상화에 의존해야 하며 구체화에 의존하면 안된다. 의존성 주입은 이 원칙을 따르는 방법  
 - 구현 클래스에 의존하지 말고 인터페이스에 의존  
 - 클라이언트는 역할(인터페이스)에 의존해야 유연하게 구현체를 변경할 수 있다.  

DIP 위반  
 - MemberRepository m = new MemoryMemberRepository();  
 - 인터페이스에 의존하지만, 구현 클래스에도 동시에 의존하는 문제 코드  

스프링 DI(Dependency Injection)  
 - 스프링은 DI(의존성 주입) 으로 OCP, DIP를 가능하게 지원한다.  
 - 클라이언트 코드의 변경 없이 기능 확장 가능  
 - 쉽게 부품을 교체하듯이 개발한다.  
 
 도메인 설계  
 -역할과 구현을 분리해서 자유롭게 구 객체를 조립할 수 있게 설계한다.  
 -회원 저장소와 할인 정책을 유연하게 변경 가능  
 
 ![11](https://user-images.githubusercontent.com/35962655/124605367-cb333400-dea6-11eb-9ab7-ad5c50f82d80.PNG)
  역할과 구현을 충실하게 분리 잘함  
- 다형성도 활용하고, 인터페이스와 구현 객체를 분리 잘함  
- OCP , DIP 설계 원칙을 준수한것처럼 보이지만 아니다.  
DIP   
 -클라이언트(OrderServiceImpl)은 DiscountPolicy 터페이스에 의존하여 DIP를 지킨것 같지만 FixDixcountPolicy같은 구체 클래스에도 의존하고 있으므로 DIP 위반  
OCP  
 - 기능을 확장하려면 클라이언트 코드에 영향을 주므로 OCP 위반  
 ![22](https://user-images.githubusercontent.com/35962655/124605579-07ff2b00-dea7-11eb-809d-c96260b0a76b.PNG)  
 - 인터페이스만 의존하도록 설계와 코드 변경  
- 구현체가 없으므로 null pointer exception 발생  
해결   
- 누군가가 클라이언트인 OrderServiceImpl에 DiscountPolicy의 구현 객체를 대신 생성하고 주입해야함  
AppConfig  
- 애플리케이션의 전체 동작 방식을 구성하기 위해, 구현 객체를 생성하고, 연결하는 책임을 가지는 별도의 설정 클래스   
 ![33](https://user-images.githubusercontent.com/35962655/124606040-7a700b00-dea7-11eb-9218-b6bd87e4915c.PNG)  
 - AppConfig는 애플리케이션의 실제 동작에 필요한 구현 객체를 생성  
  ex) MemberServiceImpl , MemoryMemberRepository, OrderSErviceImpl, FixDiscountPolicy  
- AppConfig는 생성한 객체 인스턴스의 레퍼런스를 생성자를 통해서 주입해줌  
  ex) MemberServiceImpl -> MemoryMemberRepository  
       OrderServiceImpl -> MemoryMemberRepository, FixDiscountPolicy  
 ![44](https://user-images.githubusercontent.com/35962655/124606382-cd49c280-dea7-11eb-8374-bcbe17200f15.PNG)
 - 설계 변경으로 MemberServiceImpl은 MemoryMemberRepository를 의존하지 않음  
- MemberServiceImpl 입장에서 어떤 구현객체가 들어올지 결정할수 없고 외부(AppConfig)에서 결정 
- - 객체의 생성과 연결은 AppConfig가 담당  
- DIP완성 : MemberServiceImpl은 MemberRepository인 추상에만 의존, 구체 클래스를 몰라도 된다.  
- 관심사의 분리 : 객체를 생성하고 연결하는 역할과 실행하는 역할이 명확히 분리됨   
-appConfig 객체는 memoryMemberRepository 객체를 생성하고 그 참조값을 memberServiceImple을 생성하면서 생성자로 전달  
-클라이언트인 memberServiceImpl 입장에서 보면 의존관계를 마치 외부에서 주입해주는 것 같다고 해서 DI(Dependency Injection) 의존성 주입이라 한다. 

할인 정책 적용  
-AppConfig의 등장으로 애플리케이션이 크게 사용영역과, 객체를 생성하고 구성하는 영역으로 분리  
![55](https://user-images.githubusercontent.com/35962655/124606840-3cbfb200-dea8-11eb-9d74-9cf04458894c.PNG)  
-FixDiscountPolicy를 RateDiscountPolicy로 변경해도 구성 영역만 영향을 받고, 사용 영역은 전혀 영향을 받지 않음  
-이제 할인 정책을 변경해도, 애플리케이션의 구성 역할을 담당하는 AppConfig만 변경하면 됨  
- SRP(단일 책임 원칙)가 충족되어 짐 기존에는 OrderServiceImpl이 구현객체를 스스로 생성했지만 AppConfig로 책임을 넘김  
- OCP도 만족함 , AppConfig가 의존관계를 변경해서 클라이언트 코드에 주입하므로 클라이언트 코드는 변경하지 않아도 됨  
 
제어의 역전 IoC(Inversion of Controller)  
 - 기존 프로그램은 클라이언트 구현 객체가 스스로 필요한 서버 구현 객체를 생성하고 연결하고 실행함, 즉 구현 객체가 프로그램의 제어 흐름을 스스로 조종  
 - AppConfig가 등장한 이후 구현 객체(ex OrderServiceImpl)는 자신의 로직을 실행하는 역할만 담당, 프로그램 제어는 AppConfig가 한다.  
 - 프로그램의 제어 흐름을 직접 제어하는 것이 아니라 외부에서 관리하는 것을 제어의 역전(IoC)라고 한다.  

의존 관계 주입 DI(Dependency Injection)  
 - OrderServiceImpl은 DiscountPolicy 인터페이스에 의존하지만 실제 어떤 구현 객체가 사용될지는 모름  
 - 정적인 의존관계는 코드만 보고 판단 가능, OrderServiceImpl은 MemberRepository, DiscountPolicy에 의존한다. 하지만 실제 어떤 객체가 OrderServiceImpl에 주입될지는 모름  
 - 동적인 객체 인스턴스 의존관계는 애플리케이션 실행 시점에 실제 생성된 객체 인스턴스의 참조가 연결된 의존관계  
 - 애플리케이션 실행 시점(런타임)에 외부에서 실제 구현 객체를 생성하고 클라이언트에 전달해서 클라이언트와 서버의 실제 의존관계가 연결 되는 것을 의존관계 주입이라 한다.  
 - 의존 관계 주입은 객체 인스턴스를 생성하고, 그 참조값을 전달해서 연결  
 - 의존관계 주입을 사용하면 클라이언트 코드를 변경하지 않고, 클라이언트가 호출하는 대상의 타입 인스턴스를 변경할수 있음  

IoC 컨테이너, DI 컨테이너  
 - AppConfig처럼 객체를 생성하고 관리하면서 의존관계를 연결해 주는 것을 IoC 컨테이너 또는 DI컨테이너라 한다.  

스프링으로 전환하기  
-AppConfig에 설정을 구성한다는 뜻의 @Configuration을 붙여준다.  
-각 메서드에 @Bean을 붙여준다. 이렇게 하면 스프링 컨테이너에 스프링 빈으로 등록된다.  

스프링 컨테이너
 -ApplicationContext를 스프링 컨테이너라 한다.  
 -기존에는 개발자가 AppConfig를 사용하여 직접 객체를 생성하고 DI를 했지만, 이제부터는 스프링 컨테이너를 통해서 사용  
 - 스프링 컨테이너는 @Configuration이 붙은 AppConfig를 설정 정보로 사용, 여기서 @Bean이라 적힌 메서드를 모두 호출해서 반환된 객체를 스프링 컨테이너에 등록한다. 이렇게 스프링 컨테이너에 등록된 객체를 스프링 빈이라고 한다.  
 - 스프링 빈은 @Bean이 붙은 메서드의 명을 스프링 빈의 이름으로 사용  
 - 스프링 빈은 applicationContext.getBean() 메서드를 사용해서 찾을 수 있음  
 - 기존에는 개발자가 직접 자바코드로 모든것을 했다면 스프링 컨테이너에 객체를 스프링 빈으로 등록하고 스프링 컨테이너에서 스프링 빈을 찾아서 사용하도록 변경됨  
