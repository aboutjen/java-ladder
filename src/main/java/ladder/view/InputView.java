package ladder.view;

import ladder.dto.PlayerName;
import ladder.dto.Players;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class InputView {
    private final static String QUESTION_PLAYER_NAMES = "참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)";
    private final static String QUESTION_LADDER_HEIGHT = "최대 사다리 높이는 몇 개인가요?";

    private final static Scanner scanner = new Scanner(System.in);

    private InputView() {
        //
    }

    public static Players getPlayers() {
        System.out.println(QUESTION_PLAYER_NAMES);
        String nameInput = scanner.next();
        System.out.println();

        List<String> names = Arrays.stream(nameInput.split(",")).collect(Collectors.toList());

        return new Players(names);
    }

    public static int getLadderHeight() {
        System.out.println(QUESTION_LADDER_HEIGHT);
        int ladderHeight = scanner.nextInt();
        System.out.println();

        return ladderHeight;
    }

}
