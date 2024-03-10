package access.b;
import access.a.PublicClass;

public class PublicClassOuterMain {
    PublicClass publicClass = new PublicClass();
    //다른 패키지에서 default class 접근 불가
    //DefaultClass1 defaultClass1 = new DefaultClass1();
    //DefaultClass2 defaultClass2 = new DefaultClass2();
}