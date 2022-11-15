package lotto;

import lotto.domain.Lotto;
import lotto.domain.WinningLotto;
import lotto.statistics.CorrectType;
import lotto.statistics.WinningStatistics;

import java.util.List;

public class LottoCompareContext {

    private static String lookUpAllLotto(List<Lotto> lottos, WinningLotto winningLotto) {
        for (Lotto lotto : lottos) {
            CorrectType correctType = winningLotto.compareNumber(lotto);
            WinningStatistics.plus(correctType);
        }

        return WinningStatistics.printlnResultString();
    }
}
