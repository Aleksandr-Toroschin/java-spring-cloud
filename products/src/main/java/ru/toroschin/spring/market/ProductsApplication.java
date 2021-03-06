package ru.toroschin.spring.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductsApplication {
	// План на курс:
	// 1. + Добавлять фото
	// 2. +++ Где хранить корзины? Надо сделать для каждого юзера свою корзину
	// 3. Склад
	// 4. + Добавить платежную систему
	// 5. + Загрузка товаров из файла
	// 6. + Регистрация пользователей
	// 7. +++ Нормальная фильтрация товаров
	// 8. Рубрикатор товаров
	// 9. Комментарии клиентов к товарам (возможно рейтинг)
	// 10. Разбивка на страницы (+профиль пользователя)
	// 11. +++ При оформлении заказа нужно указать доп информацию: телефон, адрес доставки
	// 12. Промокоды
	// *. *** Интеграция с 1С
	// *. *** Админка

	// Домашнее задание:
	// 1. Добавить к магазину возможность выгрузки всех товаров, и отдельных товаров по id через SOAP сервис

	public static void main(String[] args) {
		SpringApplication.run(ProductsApplication.class, args);

//		SpringApplication application = new SpringApplication(MarketApplication.class);
//		application.setAdditionalProfiles("ssl");
//		application.run(args);
	}

}
