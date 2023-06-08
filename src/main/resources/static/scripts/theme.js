const themeAttributeName = "data-bs-theme";
const themeLocalStorageKey = "theme_tasker";
const buttonSwitchTheme = document.getElementById("switchTheme");

buttonSwitchTheme.addEventListener("change", function () {
  const pageCurrentTheme = getPageCurrentTheme();

  setTheme(pageCurrentTheme == "light" ? "dark" : "light");
});

document.addEventListener("load", function () {
  const localStorageTheme = localStorage.getItem(themeLocalStorageKey);
  setTheme(localStorageTheme ?? getOSCurrentTheme());
});

function getOSCurrentTheme() {
  return window.matchMedia &&
    window.matchMedia("(prefers-color-scheme: dark)").matches
    ? "dark"
    : "light";
}

function getPageCurrentTheme() {
  return document.body.getAttribute(themeAttributeName) ?? "dark";
}

function setTheme(theme) {
  const body = document.body;
  body.setAttribute(themeAttributeName, theme);
  localStorage.setItem(themeLocalStorageKey, theme);
}
