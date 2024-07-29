package org.checkmate.common.util;

import lombok.Getter;

@Getter
public enum FilePath {

    // FONT
    EXTERNAL_FT("/org/checkmate/fonts/BMEULJIRO.otf"),

    // COMMON
    LOGIN_FX("/org/checkmate/view/layouts/common/loginPage.fxml"),
    LOGIN_ST("/org/checkmate/view/style/common/loginPage.css");

    private final String filePath;

    FilePath(String filePath) {
        this.filePath = filePath;
    }

}