// A simple ReviewNotification class
class ReviewNotification
{
	// To store notification message
	String notification;

	public ReviewNotification(String notification)
	{
		this.notification = notification;
	}
	public String getReviewNotification()
	{
		return notification;
	}
}

// Collection interface
interface Collection
{
	public Iterator createIterator();
}

// Collection of notifications
class ReviewNotificationCollection implements Collection
{
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	ReviewNotification[] notificationList;

	public ReviewNotificationCollection()
	{
		notificationList = new ReviewNotification[MAX_ITEMS];
		// Let us add some dummy notifications
		addItem("Review Notification 1");
		addItem("Review Notification 2");
		addItem("Review Notification 3");
		addItem("Review Notification 4");
		addItem("Review Notification 5");
	}

	public void addItem(String str)
	{
		ReviewNotification notification = new ReviewNotification(str);
		if (numberOfItems >= MAX_ITEMS)
			System.err.println("Full");
		else
		{
			notificationList[numberOfItems] = notification;
			numberOfItems = numberOfItems + 1;
		}
	}

	public Iterator createIterator()
	{
		return new ReviewNotificationIterator(notificationList);
	}
}

// We could also use Java.Util.Iterator
interface Iterator
{
	
	boolean hasNext();

	Object next();
}

// ReviewNotification iterator
class ReviewNotificationIterator implements Iterator
{
	ReviewNotification[] notificationList;

	int pos = 0;
	public ReviewNotificationIterator (ReviewNotification[] notificationList)
	{
		this.notificationList = notificationList;
	}

	public Object next()
	{
		ReviewNotification notification = notificationList[pos];
		pos += 1;
		return notification;
	}

	public boolean hasNext()
	{
		if (pos >= notificationList.length ||
			notificationList[pos] == null)
			return false;
		else
			return true;
	}
}

class PrinitngNotification
{
	ReviewNotificationCollection notifications;

	public PrinitngNotification(ReviewNotificationCollection notifications)
	{
		this.notifications = notifications;
	}

	public void printReviewNotifications()
	{
		Iterator iterator = notifications.createIterator();
		System.out.println("-------NOTIFICATION BAR------------");
		while (iterator.hasNext())
		{
			ReviewNotification n = (ReviewNotification)iterator.next();
			System.out.println(n.getReviewNotification());
		}
	}
}

// Driver class
public class Main
{
	public static void main(String args[])
	{
		ReviewNotificationCollection nc = new ReviewNotificationCollection();
		PrinitngNotification nb = new PrinitngNotification(nc);
		nb.printReviewNotifications();
	}
}

