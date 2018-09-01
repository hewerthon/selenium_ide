package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SignSBFH {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://beta.sodtechnologies.com/skadate/meupatricinio/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testSignSBFH() throws Exception {
    // Variables section
    // ERROR: Caught exception [ERROR: Unsupported command [getEval | data = new Date(); day = data.getDate(); | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getEval | data = new Date(); mes = data.getMonth()+1; | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getEval | data = new Date(); ano = data.getFullYear(); | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getEval | data = new Date(); hora = data.getHours(); | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getEval | data = new Date(); min = data.getMinutes(); | ]]
    // ERROR: Caught exception [ERROR: Unsupported command [getEval | data = new Date(); seg = data.getSeconds(); | ]]
    System.out.println(day + "-" + month + "-" + year + "-" + hours + "-" + min + "-" + seg);
    String evidencePath = "C:\\Users\\Desktop\\Google Drive\\Meu Patrocinio\\Automatizacao\\MeuPatronicio\\Evidencias\\Sign\\";
    // Reset previous navigation
    // ERROR: Caught exception [ERROR: Unsupported command [deleteAllVisibleCookies |  | ]]
    // MP
    driver.get("https://dating.meupatrocinio.com/member/terms.php");
    // Accept term
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.id("agree")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.id("agree")).click();
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.id("agree_btn")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.id("agree_btn")).click();
    // Crie sua conta
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.id("email")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("hewerthon.testemp" + year + month + day + hours + min + seg + "@mailinator.com");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.id("re_email")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.id("re_email")).clear();
    driver.findElement(By.id("re_email")).sendKeys("hewerthon.testemp" + year + month + day + hours + min + seg + "@mailinator.com");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.id("password")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("123456");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.id("re_password")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.id("re_password")).clear();
    driver.findElement(By.id("re_password")).sendKeys("123456");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.id("nascimento")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.id("nascimento")).click();
    driver.findElement(By.linkText("9")).click();
    new Select(driver.findElement(By.id("sex"))).selectByVisibleText("Feminino");
    driver.findElement(By.xpath("(//input[@name='extended[what]'])[2]")).click();
    driver.findElement(By.name("match_sex[]")).click();
    new Select(driver.findElement(By.id("select_one"))).selectByVisibleText("Televisão");
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    // Confirmar Profile Type
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.xpath("(//button[@type='button'])[5]")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
    // Sobre Você
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.id("state_id")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    new Select(driver.findElement(By.id("state_id"))).selectByVisibleText("Sao Paulo");
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.id("city_id")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    new Select(driver.findElement(By.id("city_id"))).selectByVisibleText("São Paulo");
    new Select(driver.findElement(By.id("height1"))).selectByVisibleText("170 cm");
    new Select(driver.findElement(By.id("body_type"))).selectByVisibleText("Magro");
    new Select(driver.findElement(By.id("ethnicity"))).selectByVisibleText("Branco / Caucasiano");
    new Select(driver.findElement(By.id("hair_color"))).selectByVisibleText("Castanho");
    new Select(driver.findElement(By.id("eye_color"))).selectByVisibleText("Castanho Claro");
    new Select(driver.findElement(By.id("smoke"))).selectByVisibleText("Nunca");
    new Select(driver.findElement(By.id("drink"))).selectByVisibleText("Socialmente");
    new Select(driver.findElement(By.id("relationship"))).selectByVisibleText("Solteiro(a)");
    new Select(driver.findElement(By.id("have_children"))).selectByVisibleText("Não");
    new Select(driver.findElement(By.id("education"))).selectByVisibleText("Superior completo");
    new Select(driver.findElement(By.id("occupation"))).selectByVisibleText("Consultor");
    driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
    // O seu perfil
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.id("username")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    driver.findElement(By.id("username")).clear();
    driver.findElement(By.id("username")).sendKeys("Teste" + year + month + day + hours + min + seg);
    driver.findElement(By.id("headline")).clear();
    driver.findElement(By.id("headline")).sendKeys("Teste MP 😀");
    driver.findElement(By.id("general_description")).clear();
    driver.findElement(By.id("general_description")).sendKeys("Teste MP 😀");
    new Select(driver.findElement(By.id("happy_to_travel"))).selectByVisibleText("Mundo Inteiro");
    new Select(driver.findElement(By.id("lifestyle_budget"))).selectByVisibleText("Negociável");
    driver.findElement(By.id("description")).clear();
    driver.findElement(By.id("description")).sendKeys("Teste MP 😀");
    driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
    // Carregar Foto
    for (int second = 0;; second++) {
    	if (second >= 60) fail("timeout");
    	try { if (driver.findElement(By.cssSelector("img.img-responsive.one")).isDisplayed()) break; } catch (Exception e) {}
    	Thread.sleep(1000);
    }

    // ERROR: Caught exception [ERROR: Unsupported command [selectWindow | null | ]]
    driver.findElement(By.id("one")).clear();
    driver.findElement(By.id("one")).sendKeys("C:\\Users\\\\Hewerthon\\Google Drive\\Meu Patrocinio\\Atividades\\Fotos\\Artistas\\Mulheres\\Alexandra Daddario 6.jpg");
    driver.findElement(By.xpath("(//button[@type='button'])[11]")).click();
    // Finaliza Sessão
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
