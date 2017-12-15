package verlierer;

import java.util.*;

public class Chinese extends Language{
    String languageName = "Chinese";
    public static String[] wordArray = new String[] {"\u4f60\u597d (n\u01D0h\u01CEo)", "\u518D\u898B (z\u00E0iji\u00E0n)",
            "\u662f (sh\u00EC)", "\u6c92\u6709 (m\u00E9iy\u01D2u)", "\u8B1D\u8B1D (xi\u00E8xie)", "\u597d (h\u01CEo)", "\u58DE (hu\u00E0i)", "\u4e0d (b\u00F9)",
            "\u5feb\u6a02 (ku\u00E0il\u00E8)", "\u50b7\u5fc3 (sh\u0101ngx\u012Bn)", "\u8ab0 (shu\u00ED)", "\u4ec0\u9ebc (sh\u00E9nme )",
            "\u4ec0\u9ebc\u6642\u5019 (sh\u00E9nme sh\u00EDh\u00F2u)", "\u54ea\u88e1 (n\u01CEl\u01D0)", "\u70ba\u4ec0\u9ebc (w\u00E8ish\u00E9nme)",
            "\u600e\u9ebc\u6a23 (z\u011Bnmey\u00E0ng)"};

    public ArrayList<String> translatedWordList = new ArrayList(Arrays.asList(wordArray));

    public Chinese(){
        super.languageName = this.languageName;
        super.translatedWordList = this.translatedWordList;
    }

    public Character createCharacter() {
        return new Germany();
    }

    @Override
    public ArrayList<String> getWordList() {
        return translatedWordList;
    }
}
