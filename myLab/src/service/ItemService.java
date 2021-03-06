package service;

import java.util.List;

import bean.Item;

public interface ItemService {
	List<Item> findAllItem();
	Item findItemById(int id);
	void updateItem(Item item);
	void deleteById(int id);
	void saveItem(Item item);
	List<Item> queryItemListByName(String name);
	List<Item> findItemByWeek(long currentTime,List list);
	List<Item> findItemByNameWeek(Long currentTime, List<Integer> list,String name);
}
