Feature:n11 Web Sitesi Otomasyonu
  Scenario:n11 Websitesi Sepete Ürün ekleme
    Given Websitesine git
    Given Hesabına giriş yap
    When  Elektronik üzerine mause yi götür
    When  Telefon Aksesuarları bölümüne tıkla
    When  Apple seç
    When  Model seç
    When  Renk Kırmızı seç
    When  Çıkan ürünlerden ilkine tıkla
    When  SepeteEkleye tıkla
    When  Sepetime Tıkla
    Then  Ürünün geldiğini doğrulayın



