package ladder.view;

import ladder.domain.Ladder;
import ladder.domain.People;
import ladder.domain.Person;

import java.util.Scanner;

public class InputView {

    public static People getPersonNames() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요");
        Scanner scanner = new Scanner(System.in);

        return new People(scanner.nextLine());
    }

    public static Ladder getLadderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        Scanner scanner = new Scanner(System.in);

        return new Ladder(scanner.nextInt());
    }

    public static String getResult() {
        System.out.println("실행 결과를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static Person getWantPeopleForResult() {
        System.out.println("결과를 보고 싶은 사람은?");
        Scanner scanner = new Scanner(System.in);
        return new Person(scanner.nextLine());
    }
}
