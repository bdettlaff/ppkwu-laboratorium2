package com.dettlaff.zadanie2.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping
public class StringUtilsEndpoint {

    private boolean flag = false;

    @GetMapping("count/lowercase/{word}")
    public int countLowerCharacters(@PathVariable String word) {
        int lowerCase = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                lowerCase++;
            }
        }

        return lowerCase;
    }

    @GetMapping("count/uppercase/{word}")
    public int countUpperCharacters(@PathVariable String word) {
        int upperCase = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upperCase++;
            }
        }

        return upperCase;
    }

    @GetMapping("count/space/{word}")
    public int countSpaceCharacters(@PathVariable String word) {
        int spaceCharacter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                spaceCharacter++;
            }
        }

        return spaceCharacter;
    }

    @GetMapping("count/digits/{word}")
    public int countDigits(@PathVariable String word) {
        int digit = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                digit++;
            }
        }

        return digit;
    }

    @GetMapping("has/lowercase/{word}")
    public boolean hasLowerCharacters(@PathVariable String word) {
        boolean flag = false;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    @GetMapping("has/uppercase/{word}")
    public boolean hasUpperCharacters(@PathVariable String word) {
        boolean flag = false;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    @GetMapping("has/special/{word}")
    public boolean hasSpecialCharacters(@PathVariable String word) {
        return isSpecialCharacter(word);
    }

    private boolean isSpecialCharacter(@PathVariable String word) {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(word);

        return m.find();
    }

    @GetMapping("has/space/{word}")
    public boolean hasSpaceCharacters(@PathVariable String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isSpaceChar(word.charAt(i))) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    @GetMapping("has/digits/{word}")
    public boolean hasDigits(@PathVariable String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    @GetMapping("has/lowerUpperCase/{word}")
    public boolean hasLowerUpperCase(@PathVariable String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i)) || Character.isUpperCase(word.charAt(i))) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    @GetMapping("has/lowerSpecialCase/{word}")
    public boolean hasLowerSpecialCase(@PathVariable String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i)) || isSpecialCharacter(word)) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    @GetMapping("has/lowerDigitCase/{word}")
    public boolean hasLowerDigitCase(@PathVariable String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i)) || Character.isDigit(word.charAt(i))) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    @GetMapping("has/all/{word}")
    public boolean hasLowerDigitSpecialUpperCase(@PathVariable String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i)) || Character.isDigit(word.charAt(i)) || isSpecialCharacter(word) || Character.isUpperCase(word.charAt(i))) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    @GetMapping("has/lowerUpperSpecial/{word}")
    public boolean hasLowerUpperSpecial(@PathVariable String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i)) || isSpecialCharacter(word) || Character.isUpperCase(word.charAt(i))) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    @GetMapping("has/lowerDigitSpecial/{word}")
    public boolean hasLowerDigitSpecial(@PathVariable String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i)) || isSpecialCharacter(word) || Character.isDigit(word.charAt(i))) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    @GetMapping("has/upperSpecial/{word}")
    public boolean hasUpperSpecial(@PathVariable String word) {
        for (int i = 0; i < word.length(); i++) {
            if (isSpecialCharacter(word) || Character.isUpperCase(word.charAt(i))) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    @GetMapping("has/upperDigit/{word}")
    public boolean hasUpperDigit(@PathVariable String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i)) || Character.isDigit(word.charAt(i))) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    @GetMapping("has/upperSpecialDigit/{word}")
    public boolean hasUpperDigitSpecial(@PathVariable String word) {
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i)) || isSpecialCharacter(word) || Character.isDigit(word.charAt(i))) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    @GetMapping("has/specialDigit/{word}")
    public boolean hasSpecialDigit(@PathVariable String word) {
        for (int i = 0; i < word.length(); i++) {
            if (isSpecialCharacter(word) || Character.isDigit(word.charAt(i))) {
                flag = true;
                break;
            }
        }

        return flag;
    }

}
