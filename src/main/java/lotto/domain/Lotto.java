package lotto.domain;

import java.util.List;
import lotto.util.NumberValidator;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        NumberValidator.validateLottoNumbers(numbers);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
