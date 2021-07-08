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

스프링 컨테이너 생성
![66](https://user-images.githubusercontent.com/35962655/124613522-46e4af00-deae-11eb-9339-54080a8374e9.PNG)
- ApplicationContext는 인터페이스이자 스프링 컨테이너이다.  
- 스프링 컨테이너는 XML을 기반으로 만들 수 있고, 애노테이션 기반의 자바 설정 클래스로 만들수 있다.  
- AppConfig 사용했던 방식이 애노테이션 기반의 자바 설정 클래스로 스프링 컨테이너를 만든 것  
- new AnnotationConfigApplicationContext(AppConfig.class)는 ApplicationContext의 구현체이다.  
- 스프링 컨테이너를 생성할 때는 구성 정보를 지정해주어야 하는데 여기서는 AppConfig.class를 구성정보로 지정  

스프링 빈 등록
 - 스프링 컨테이너는 파라미터로 넘어온 설정 클래스 정보를 사용해서 스프링 빈을 등록한다.  
 ![77](https://user-images.githubusercontent.com/35962655/124614446-3254e680-deaf-11eb-90cb-8c2e1ca53779.PNG)  
빈 이름  
-빈 이름은 메서드 이름을 사용한다.  
-빈 이름을 직접 부여할 수 도 있음 ex) @bean(name="memberService2")   

스프링 빈 의존관계 설정  
- 스프링 컨테이너는 설정 정보를 참고해서 의존관계를 주입(DI)  

컨테이너에 등록된 모든 빈 조회  
- ac.getBeanDefinitionNames() : 스프링에 등록된 모든 빈 이름을 조회  
- ac.getBean() : 빈 이름으로 빈 객체(인스턴스)를 조회  
- 스프링 내부에서 사용하는 빈은 getRole()로 구분 가능하다. ROLE_APPLICATION은 사용자가 정의한 빈이다.  

스프링 빈 조회 - 기본  
 - 스프링 컨테이너에서 스프링 빈을 찾는 기본적인 방법  
 - ac.getBean(빈 이름, 타입)  
 - ac.getBean(타입)  
 - 조회 대상 스프링 빈이 없으면 예외 발생(NoSuchBeanDefinitionException)  

스프링 빈 조회 - 동일한 타입이 둘 이상  
 - 타입으로 조회시 같은 타입의 스프링 빈이 둘 이상이면 오류 발생, 이때는 빈 이름 지정해야 함  
 - ac.getBeansOfType()을 사용하면 해당 타입의 모든 빈 조회 가능  

스프링 빈 조회 - 상속관계  
 - 부모 타입으로 조회하면, 자식 타입도 함께 조회됨  
 - 자바 객체의 최고 부모인 Object 타입으로 조회하면, 모든 스프링 빈 조회   

BeanFactory와 ApplicationContext   
BeanFactory  
 - 스프링 컨테이너의 최상위 인터페이스  
 - 스프링 빈을 관리하고 조회하는 역할, getBean() 제공  
 - BeanFactory를 직접 사용할 일은 거의 없음  

ApplicationContext  
 -BeanFactory 기능을 모두 상속받아서 제공  
 -빈을 관리하고 조회하는 기능은 물론이고, 수많은 부가기능 제공  
 -BeanFactory나 ApplicationContext를 스프링 컨테이너라 한다.  
 - 메시지소스를 활용한 국제화 기능 : 한국에서 들어오면 한국어로, 영어권에서 들어오면 영어로 출력  
- 환경 변수 : 로컬, 개발, 운영 등을 구분해서 처리  
- 애플리케이션 이벤트 : 이벤트를 발행하고 구독하는 모델을 지원  
- 편리한 리소스 조회 : 파일, 클래스패스, 외부 등에서 리소스를 편리하게 조회  

XML 설정 사용  
 - 레거시 프로젝트에서 xml 을 사용하는 경우도 많다  
 - GenericXmlApplicationContext를 사용하면서 xml 설정 파일을 넘긴다.  

스프링 빈 설정 메타 정보 - BeanDefinition  
- BeanDefinition이라는 추상화가 있기에 스프링은 다양한 설정 형식을 지원한다.  
- XML 혹은 자바 코드를 읽어서 BeanDefinition을 만든다.  
- 스프링 컨테이너는 자바 코드인지, XML인지 몰라도 된다. 오직 BeanDefinition만 알면 됨  
- BeanDefinition을 빈 설정 메타정보라 한다.  
- 스프링 컨테이너는 이 메타정보를 기반으로 스프링 빈 생성  

- AnnotationConfigApplicationContext는 AnnotatedBeanDefinitionReader를 사용해서 AppConfig.class를 읽고 BeanDefinition 생성  
- GenericXmlApplicationContext는 XmlBeanDefinitionReader를 사용해서 appConfig.xml 설정 정보를 읽고 BeanDefinition을 생성  

싱글톤 컨테이너  
 웹 어플리케이션은 여러 고객이 동시에 요청  
- 지금 까지 만들었던 스프링 없는 순수한 DI 컨테이너인 AppConfig는 요청할 때 마다 객체를 생성함  
- 고객 트래픽이 초당 100이 나오면 초당 100개의 객체가 생성되고 소멸 -> 메모리 낭비 심함  
- 해결 방안은 객체가 1개만 생성되고, 공유하도록 설계 -> 싱글톤 패턴  

싱글톤 패턴  
 - 클래스의 인스턴스가 1개만 생성되는 것을 보장하는 디자인 패턴  
 - private 생성자를 사용해서 외부에서 임의로 new 키워드를 사용하지 못하도록 막음  
 ![image](https://user-images.githubusercontent.com/35962655/124770523-5c70dc00-df75-11eb-9da4-143e6947b034.png)  
 - static 영역에 객체 instance는 미리 하나 생성해서 올려둠  
- 이 객체 인스턴스가 필요하면 오직 getInstance() 메소드를 통해서만 조회 가능, 이 메서드를 호출하면 항상 같은 인스턴스를 반환  
- 생성자를 private으로 막아서 외부에서 new 키워드로 객체 인스턴스가 생성되는 것을 막음  
- 호출할 때 마다 같은 객체 인스턴스를 반환  
- 생성자를 private으로 막아서 외부에서 new 키워드로 객체 인스턴스가 생성되는 것을 막음  

싱글톤 패턴 문제점  
- 싱글톤 패턴을 구현하는 코드 자체가 많이 들어감  
- 의존 관계상 클라이언트가 인터페이스에 의존하지 않고 구체 클래스에 의존 -> DIP 위반  
- 클라이언트가 구체 클래스에 의존해서 OCP 원칙을 위반할 가능성이 높음  
- 테스트하기 어려움  
- 내부 속성을 변경하거나 초기화 하기 어려움  
- private 생성자로 자식 클래스를 만들기 어려움  
- 유연성이 떨어지고 안티패턴으로 불림  

 싱글톤 컨테이너  
 - 스프링 컨테이너는 싱글턴 패턴을 적용하지 않아도, 객체 인스턴스를 싱글톤으로 관리  
 - 스프링 컨테이너는 싱글턴 컨테이너 역할을 한다. 싱글톤 객체를 생성하고 관리하는 기능을 싱글톤 레지스트리라 함  
 - DIP, OCP, 테스트, private 생성자로 부터 자유롭게 싱글톤을 사용할 수 있음  
 - 스프링 컨테이너 덕분에 이미 만들어진 객체를 공유해서 효율적으로 재사용할 수 있다.

싱글톤 방식의 주의점  
 -객체 인스턴스를 하나만 생성해서 공유하는 싱글톤 방식은 여러 클라이언트가 하나의 같은 객체 인스턴스를 공유하기 때문에 싱글톤 객체는 상태를 유지(stateful)하게 설계하면 안됨 -> 무상태(stateless)로 설계 해야 한다.  
- 특정 클라이언트에 의존적인 필드가 있으면 안되고 특정 클라이언트가 값을 변경할 수 있는 필드가 있으면 안된다  
- 가급적 읽기만 가능해야 한다.  
- 필드 대신에 자바에서 공유되지 않는, 지역변수, 파라미터, ThreadLocal 등을 사용해야 한다.  
- 스프링 빈의 필드에 공유 값을 설정하면 큰 장애가 발생할 수 있음  
- StatefulService의 price 필드는 공유되는 필드여서 사용자A 주문금액은 10000원이 되어야 하는데, 2000원이라는 결과가 나옴  
- 공유필드는 조심해야 하며, 스프링 빈은 항상 무상태(stateless)로 설계 해야 한다.  

 @Configuration과 싱글톤  
- memberService 혹은 orderService를 호출할때 MemoryMemberRepository를 new로 생성한다.  
- 각각 다른 2개의 MemoryMemberRepository가 생성되면서 싱글톤이 깨지는 것처럼 보임  
- 테스트를 위해 getMemberRepository()를 임시로 추가하고 같은 MemoryMemberRepository인지 테스트 한다.  
- 확인 결과 memberRepository 인스턴스는 같은 인스턴스가 공유되어 사용되며 한번씩만 호출된다.  

@Configuration과 바이트 코드 조작  
 - 자바 코드를 보면 new로 객체를 여러번 호출하는 것이 맞다.  
 - 스프링은 클래스의 바이트 코드를 조작하는 라이브러리를 사용하여 객체를 하나만 생성되도록 한다.  
 - @Configuration이 객체 하나만 호출되게 한다.  
 - AppConfig도 스프링 빈이므로 AppConfig그를 조회해서 클래스 정보를 출력한다.  
 - 순수한 클래스라면 class hello.core.AppConfig 로 출력되어야 함  
- 스프링이 바이트코드 조작 라이브러리를 사용해서 AppConfig 클래스를 상속받은 임의의 다른 클래스를 만들고, 그 다른 클래스를 스프링 빈으로 등록한 것  
 - 그 임의의 다른 클래스가 싱글톤이 보장되도록 해줌  
 - @Bean이 붙은 메서드마다 이미 스프링 빈이 존재하면 존재하는 빈을 반환하고, 스프링 빈이 없으면 생성해서 스프링 빈으로 등록하고 반환하는 코드가 있을 것이다.  

@Configuration  
-Configuration을 적용하지 않고, @Bean만 적용하면   
-AppConfig가 순수한 AppConfig로 스프링 빈에 등록된다.  
- 객체가 여러개 생성되면서 싱글턴이 보장되지 않는다. 서로 각각 다른 인스턴스가 출력되는 것이다.  
- Bean만 사용해도 스프링 빈으로 등록되지만, 싱글톤을 보장하지 않음  
- 스프링 설정 정보는 항상 @Configuration을 사용하여 싱글톤을 보장해야 한다.   

컴포넌트 스캔  
- 스프링 빈을 등록할 때는 자바 코드의 @Bean이나 XML의 <bean> 등을 설정 정보에 직접 등록했는데 등록해야 할 빈이 많아지면 일일이 등록하기 귀찮고, 설정 정보도 커지고 누락의 위험이 있다.  
- 스프링은 설정 정보가 없어도 자동으로 스프링 빈을 등록하는 컴포넌트 스캔이라는 기능 제공  
- 컴포넌트 스캔을 사용하려면 먼저 @ComponentScan을 설정 정보에 붙여준다.  
- 컴포넌트 스캔은 @Component 애노테이션이 붙은 클래스를 스캔해서 스프링 빈으로 등록한다.  
- MemoryMemberRepository, RateDiscountPolicy @Component 추가   
- MemberServiceImpl @Component, @Autowired 추가  
 
 @ComponentScan  
 - @ComponentScan은 @Component가 은 모든 클래스를 스프링 빈으로 등록  
 - 스프링 빈의 기본 이름은 클래스명을 사용하되 맨 앞글자만 소문자를 사용  
    ex) MemberServiceImpl 클래스 -> memberServiceImpl  
 - 빈 이름을 직접 지정하고 싶으면 @Component("memberService2") 이런식으로 이름 부여  
 
 @Autowired 의존관계 자동 주입  
 - 생성자에 @Autowired를 지정하면, 스프링 컨테이너가 자동으로 해당 스프링 빈을 찾아서 주입한다.  
 - 타입이 같은 빈을 찾아서 주입  
 
탐색 위치와 기본 스캔 대상  
 - 모든 자바 클래스를 다 컴포넌트 스캔하면 시간이 오래 걸리므로 필요한 위치부터 탐색하도록 한다.  
 - basePackages : 탐색할 패키지의 시작 위치를 지정, 이 패키지를 포함하여 하위 패키지를 모두 탐색  
- basePackages : {"hello.core", "hello.service"} 이런식으로 여러 시작 위치를 지정할 수 있음  
- basePackageClasses : 지정한 클래스의 패키지를 탐색 시작 위치로 지정  
- 지정하지 않으면 @ComponentScan이 붙은 설정 정보 클래스의 패키지가 시작 위치가 됨  
 
권장 방법  
 -패키지 위치를 지정하지 않고, 설정 정보 클래스의 위치를 프로젝트 최상단에 두는 것  
ex) com.hello 가 프로젝트 시작 루트 라면 여기에 AppConfig 같은 메인 설정 정보 두고, @ComponentScan 붙이고 basePackages 지정은 생략  
 
 컴포넌트 스캔 대상  
 - @Component : 컴포넌트 스캔에서 사용  
 - @Controller : 스프링 MVC 컨트롤러에서 사용  
 - @Service : 스프링 비즈니스 로직에서 사용  
 - @Repository : 스프링 데이터 접근 계층에서 사용  
 - @Configuration : 스프링 설정 정보에서 사용   

필터  
 - includeFilters : 컴포넌트 스캔 대상을 추가로 지정  
 - excludeFilters : 컴포넌트 스캔에서 제외할 대상을 지정  
 
FilterType 옵션  
 - ANNOTATION : 기본값, 애노테이션을 인식해서 동작  
 - ASSIGNABLE_TYPE : 지정한 타입과 자식 타입을 인식해서 동작  
 - 옵션을 변경하면서 사용하기보다는 스프링의 기본 설정에 최대한 맞추어 사용하는 것을 권장  

수동 빈 등록 vs 자동 빈 등록  
 - 최근 스프링 부트는 수동 빈 등록 이름과 자동 빈 등록 이름이 충돌나면 오류가 발생하도록 기본 값을 바꿈  
 - 이름이 충돌나지 않게 설정하자.  
 
 의존관계 자동 주입  
 다양한 의존관계 주입 방법  
 - 생성자 주입  
 - 수정자 주입(setter 주입)  
 - 필드 주입  
 - 일반 메서드 주입  

생성자 주입  
 -생성자를 통해서 의존 관계를 주입 받는 방법  
 -생성자 호출 시점에 딱 1번만 호출되는 것이 보장  
 -불변, 필수 의존관계에 사용 됨  
 -생성자가 1개만 있으면 @Autowired를 생략해도 자동 주입 됨  
 
 수정자 주입(setter 주입)  
 - setter라 불리는 필드의 값을 변경하는 수정자 메서드를 통해서 의존관계 주입  
 - 선택, 변경 가능성이 있는 의존관계에 사용  
 - @Autowired의 기본 동작은 주입할 대상이 없으면 오류가 발생, 주입할 대상이 없어도 동작하게 하려면 @Autowired(required = false)로 지정  
 
 필드 주입  
 - 필드에 바로 주입하는 방법  
 - 코드가 간결하지만 외부에서 변경이 불가능해서 테스트 하기 힘들다는 치명적인 단점 존재  
 - DI 프레임워크가 없으면 아무것도 할 수 없음  
 - 사용하지 말기  
 
 일반 메서드 주입  
 - 일반 메서드를 통해 한번에 여러 필드를 주입 받을 수 있지만 잘 사용하지 않음  
 
 옵션 처리  
 - @Autowired(required=false) : 자동 주입할 대상이 없으면 수정자 메서드 자체가 호출 안됨  
 - org.springframework.lang.@Nullable : 자동 주입할 대상이 없으면 null이 입력  
 - Optional<> : 자동 주입할 대상이 없으면 Optional.empty가 입력  
 
 생성자 주입을 쓰자  
 - DI 프레임워크 대부분이 생성자 주입을 권장한다.  
 불변  
 - 대부분의 의존관계 주입은 한번 일어나면 애플리케이션 종료시점까지 의존관계를 변경할 일이 없음  
 - 수정자 주입을 사용하면 setXxx 메서드를 public으로 열어 두어야 함 , 누군가가 변경할 수도 있음  
 - 생성자 주입은 객체를 생성할 때 딱 1번만 호출되므로 이후에 호출되는 일이 없음, 따라서 불변하게 설계 가능  

누락  
 - 순수한 자바 코드를 단위 테스트 할때 수정자 의존 관계인 경우 @Autowired가 프레임워크 안에서 동작할 때는 의존관계가 없으면 오류가 발생하지만 자바 코드에서는 오류 발생하지 않는다.  
 - 다만 실행 결과는 Null Point Exception이 발생하는데 주입이 누락 되었기 때문  
 - 생성자 주입을 사용하면 주입 데이터를 누락했을 때 컴파일 오류가 발생한다. 컴파일 오류가 가장 좋은 오류이다.  
 
 final 키워드   
 - 생성자 주입을 사용하면 필드에 final 키워드를 사용할 수 있다. 그래서 생성자에 값이 설정되지 않는 오류를 컴파일 시점에 막아 준다.  
 - 컴파일 오류를 발생하는 것이 가장 좋다.  
 
 정리  
 - 생성자 주입 방식은 프레임워크에 의존하지 않고, 순수한 자바 언어의 특징을 잘 살린다.  
 - 기본으로 생성자 주입을 사용하고, 필수 값이 아닌 경우에 수정자 주입 방식을 옵션으로 부여하자  
 - 필드 주입은 사용하지 않는게 좋음  
 
 lombok  
-실제 개발 코드는 대부분 불변이고 생성자에 final을 사용한다.  
- 생성자가 딱 1개만 있으면 @Autowired 생략할 수 있음  
- 롬복 라이브러리가 제공하는 @RequiredArgsConstructor 기능을 사용하면 final이 붙은 필드를 모아서 생성자를 자동으로 만들어줌  
- 롬복이 자바의 애노테이션 프로세서라는 기능을 이용해서 컴파일 시점에 생성자 코드를 자동으로 생성  
 
조회 빈이 2개 이상일때  
-@Autowired는 타입으로 조회   
- ac.getBean(DiscountPolicy.class) 와 유사하게 동작  
- 타입으로 조회 하면 선택된 빈이 2개 이상일 때 문제 발생  
- NoUniqueBeanDefinitionException 오류 발생  
- 하나의 빈을 기대 했는데 fixDiscountPolicy, rateDiscountPolicy 2개가 발견  
- 하위 타입으로 지정 할수도 있지만 DIP 위배하고 유연성 떨어짐  
 
 @Autowired 필드 명, @Qualifier, @Primary  
 - 조회 대상 빈이 2개 이상일 때 해결 방법은 3가지다  

@Autowired 필드 명 매칭  
  - Autowired는 타입 매칭을 시도하고, 여러 빈이 있으면 필드 이름, 파라미터 이름으로 빈 이름을 추가 매칭  
  - 필드 명 매칭은 먼저 타입 매칭을 시도하고 그 결과에 여러 빈이 있을 때 추가로 동작하는 기능  
 
 @Qualifier 사용  
- 추가 구분자를 붙여주는 방법이다. 빈 이름을 변경하는 것은 아님    
 -빈 등록시 @Qualifier를 붙임  
 -주입시에 @Qualifier를 붙여주고 등록한 이름을 적어주기  
 -@Qualifier로 주입할 때 @Qualifier("mainDiscountPolicy")를 못찾으면 mainDiscountPolicy라는 이름의 스프링 빈을 추가로 찾음  
-빈 이름도 못찾으면 NoSuchBeanDefinitionException 예외 발생  
-직접 빈 등록시에도 @Qualifier 사용 가능  
 
 @Primary 사용  
-Primary는 우선순위를 정하는 방법, @Autowired시에 여러 빈이 매칭되면 @Primary가 우선권을 가짐  
-자주 사용하는 스프링빈은 @Primary를 쓰고 가끔 사용하는 스프링 빈은 @Qualifier를 쓰는 것이 깔끔하다.

우선순위  
-@Primary는 기본값처럼 동작하고 @Qualifier는 상세하게 동작  
- 스프링은 자동보다는 수동이, 넓은 범위의 선택권 보다는 좁은 범위의 선택권이 우선순위 높음  
- @Qualifier가 우선권이 높음  
 
 조회한 빈이 모두 필요할 때, List, Map  
- 해당 타입의 스프링 빈이 다 필요한 경우 ex)클라이언트가 할인의 종류(rate, fix)를 선택할 수 있을때  
 
 자동, 수동의 올바른 실무 운영 기준  
 -자동 등록 기능을 기본으로 한다. 스프링은 @Component 뿐만 아니라 @Controller, @Service, @Repository 등 다양하게 지원  

수동 빈 사용은 언제?  
-애플리케이션은 크게 업무 로직과 기술 지원 로직으로 나뉨  
-업무 로직은 웹을 지원하는 컨트롤러, 핵심 비즈니스 로직이 있는 서비스, 데이터 계층의 로직을 처리하는 리포지토리 등..  
-기술 지원 빈은 기술적인 문제나 공통 관심사(AOP)를 처리할때 주로 사용. 데이터 베이스 연결이나, 공통 로그 처리 같은 것들..  
-업무로직은 자동기능을 적극 사용하고 기술 지원 로직은 수동 빈 등록을 사용하자.  
-비즈니스 로직중 다형성을 적극 활용할때 , 예를들면 조회한 빈이 모두 필요할 때 ex)DiscountPolicy 는 수동 빈으로 등록하거나 또는 자동으로 하면 특정 패키지에 같이 묶어 두는 것이 보기에 좋다.  

 
