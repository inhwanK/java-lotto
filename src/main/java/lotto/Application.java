package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private static final LottoStore lottoStore = new LottoStore();

    private static final String PURCHASE_AMOUNT_INPUT_MESSAGE = "구입금액을 입력해주세요.";
    private static final String AMOUNT_OUTPUT_MESSAGE = "%d개를 구매했습니다.";
    private static final String WINNING_NUMBER_INPUT_MESSAGE = "당첨 번호를 입력해 주세요";
    private static final String BONUS_NUMBER_INPUT_MESSAGE = "보너스 번호를 입력해 주세요";
    private static final String PROFIT_RATE_MESSAGE = "총 수익률은 %.2f%%입니다.";


    public static void main(String[] args) {

        System.out.println("구입금액을 입력해 주세요.");
        String amountInput = Console.readLine();

        calcAmount(amountInput);
        /* 로또 랜덤 발행
        [1, 2, 3, 4, 5, 6]
         */

        noticeInputWiningLottoNumbers();
        Lotto winingLotto = noticeWiningLottoInputMessage();
        // 1,2,3,4,5,6

        // 보너스 번호를 입력해 주세요
        // 7

        // 당첨 통계
        // ---
        /*
         ~개 일치 ()
         */

        // 총 수익률은 62.5%입니다.

        // TODO: 프로그램 구현
    }


    private static Lotto noticeWiningLottoInputMessage() {
        String input = Console.readLine();
        String[] winingLottoInput = input.split(",");

        List<Integer> winingLottoNumbers = new ArrayList<>();
        for(int i = 0; i < 6; i++) {
            Integer number = Integer.parseInt(winingLottoInput[i]);
            winingLottoNumbers.add(number);
        }
        return new Lotto(winingLottoNumbers);
    }

    private static void noticeInputWiningLottoNumbers() {
        System.out.println("당첨 번호를 입력해 주세요.");
    }

    private static Integer calcAmount(String amountInput) {

        try {
            Integer amount = Integer.parseInt(amountInput);
            return amount;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 숫자만 입력 가능합니다.");
        }

    }
}
