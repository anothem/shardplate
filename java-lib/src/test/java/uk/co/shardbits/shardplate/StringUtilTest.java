package uk.co.shardbits.shardplate;


import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringUtilTest {

    @Test
    public void is_null_or_empty_returns_true_if_null() {
        assertThat(StringUtil.isNullOrEmpty(null)).isTrue();
    }

    @Test
    public void is_null_or_empty_returns_true_if_non_null_and_empty() {
        assertThat(StringUtil.isNullOrEmpty("")).isTrue();
    }

    @Test
    public void is_null_or_empty_returns_false_if_non_null_and_non_empty() {
        assertThat(StringUtil.isNullOrEmpty("a")).isFalse();
    }

}