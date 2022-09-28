#  - Giyim--> Aksesuar--> Kadın İç Giyim-->Dizaltı Çorap bölümüne girilir.
#            - Açılan ürünün siyah olduğu doğrulanır.
#- Sepete ekle butonuna tıklanır.
#            - Sepeti Görüntüle butonuna tıklanır.
#            - Sepeti Onayla butonuna tıklanır.
#            - Üye olmadan devam et butonuna tıklanır.
#            - Mail ekranı gelir.
#- Sonrasında adres ekranı gelir. Adres oluştur dedikten sonra ödeme ekranı gelir.
#- Siparişi tamamla butonuna tıklayarak, ödeme ekranına gidildiği ,doğru ekrana yönlendiklerini kontrol edecekler.
Feature: Shopping

  Scenario Outline: User can successfully buy any production.
    Given User navigate to A101 home page
    And   Click to element on the Pom
      | cookies |
      | a101    |

    When  Move to element on the Pom
      | giyimaksesuar |
    And   Move and click to element on the Pom
      | dizalticorap |
    And   Click to element on the Pom
      | penticorap |
    Then  Verify to element on the Pom
      | siyah | siyah |
    And   Click to element on the Pom
      | sepeteEkle      |
      | sepetiGoruntule |
      | sepetiOnayla    |
      | uyeOlmadan      |
    And   Send keys on the Pom
      | userEmail | <email> |
    And   Click to element on the Pom
      | devamEt    |
      | newAddress |
    And   Send keys on the Pom
      | addressTitle | <addressTitle> |
      | name         | <firstName>    |
      | lastName     | <lastName>     |
      | phoneNumber  | <phoneNumber>  |
    And   Select to element on the Pom
      | city     | 39 | childElementCount | 82 |
      | township | 2  | childElementCount | 16 |
      | district | 35 | childElementCount | 96 |
    And   Send keys on the Pom
      | textArea | <textArea> |
    And   Click to element on the Pom
      | save      |
      | radio     |
      | saveAndGo |
    Then  Verify to element on the Pom
      | assertKart | Kart |

    Examples:
      | email                 | addressTitle | firstName | lastName | phoneNumber | textArea                                             |
      | gndgjhnytrb@gmail.com | İzmir Evim   | Cengizhan | Küçük    | 5589140706  | Orkide caddesi Manolya Sokak Papatya Apartmanı No 8  |
      | fasfbdfngfb@gmail.com | Muğla Evvvim | Müslüm    | Duman    | 5389656541  | Civciv caddesi Baykuş Sokak Kırlangıç Apartmanı No 8 |