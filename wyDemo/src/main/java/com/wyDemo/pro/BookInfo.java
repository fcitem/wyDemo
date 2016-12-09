package com.wyDemo.pro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;

/**
 * @author fengchao
 * @date 2016年12月1日
 * @注释 书籍bean
 */
public class BookInfo {

	private long categoryId;   //类别id
	private String name;	//类别名称
	private int type;       //类别类型，其中0是出版书籍分类类别，1是原创分类类别
	private StringBuilder description=new StringBuilder();
	private BookInfo parent;   //父类别，在选择书籍分类时选择父类别id是无效的,目前云阅读只有两级分类
	private String title;     //书名
	private int price;
	private String author;
	private int status;
	private int bookType;
	private String bookKey;  //书籍用户方对该书的标识符，建议选择;该值可以选择为己方书籍的唯一标识符id等
	Document doc;
	public BookInfo() {
		setCategoryId(1);
		setBookType(1);
		setStatus(2);
		setPrice(3);
		setBookKey("002");
		setAuthor("一束干花");
		setDescription(null);
		setTitle("大院里的童年");
	}
	public int getPrice() {
		return price;
	}
	public String getBookKey() {
		return bookKey;
	}
	public void setBookKey(String bookKey) {
		this.bookKey = bookKey;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getBookType() {
		return bookType;
	}
	public void setBookType(int bookType) {
		this.bookType = bookType;
	}
	
	public StringBuilder getDescription() {
		return description;
	}
	public void setDescription(StringBuilder description) {
		/*try {
			doc = Jsoup.connect("http://localhost:8080/wyDemo/description.html").get();
			List<Node> list=doc.getElementById("content").childNodes();
			for (Iterator<Node> it=list.iterator();it.hasNext();) {
				this.description.append(it.next().toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		this.description.append("<p><span>&nbsp; 简介：本书以一个孩子的视角，描述了住扎在充满佛教遗迹部队大院里的故事。整部作品以时间为轴线，写了在六十年代初至七十年代初这个期间内，围绕在作者身边的人和事，真实还原了历史，还原了风俗、人情和社会。在文中，作者以饱满的笔触写了亲人的一次反革命事件开起了作者的学生期代，接下来的一次对特务的抓扑，又让她大来眼界，启蒙老师的污点又让她震惊于人性的残酷，山那边奇特的佛像引起她无限的联想·····作者用一个个小故事将那个时代发生的事连缀成了一张大网，透过它，你可以看到整个曾经。</span></p>");
	}
	public Document getDoc() {
		return doc;
	}
	public void setDoc(Document doc) {
		this.doc = doc;
	}
	/*public void setDescription(StringBuilder description2) {
		this.description =new StringBuilder();
		this.description.append("<html>");
		description.append("<head>");
		description.append("<title>测试书籍</title>");
		description.append("</head>");
		description.append("<body>");
		description.append("<div>");
		description.append("<p>");
		description.append("&nbsp;&nbsp;简介：本书以一个孩子的视角，描述了住扎在充满佛教遗迹部队大院里的故事。整部作品以时间为轴线，写了在六十年代初至七十年代初这个期间内，围绕在作者身边的人和事，");
		description.append("真实还原了历史，还原了风俗、人情和社会。在文中，作者以饱满的笔触写了亲人的一次反革命事件开起了作者的学生期代，接下来的一次对特务的抓扑，又让她大来眼界，启蒙老师的污点");
		description.append("又让她震惊于人性的残酷，山那边奇特的佛像引起她无限的联想•••••作者用一个个小故事将那个时代发生的事连缀成了一张大网，透过它，你可以看到整个曾经。");
		description.append("</p>");
		description.append("</div>");
		description.append("</body>");
		description.append("</html>");
	}*/
 
	
	/*public void setChapterDescription(StringBuilder chapterDescription2) {
		this.chapterDescription = new StringBuilder();
		chapterDescription.append("<html>");
		chapterDescription.append("<head>");
		chapterDescription.append("<meta charset=\\\"UTF-8\\\">");
		chapterDescription.append("<title>Insert title here</title>");
		chapterDescription.append("</head>");
		chapterDescription.append("<body>");
		chapterDescription.append("<div>");
		chapterDescription.append("<p>");
		chapterDescription.append("&nbsp;&nbsp;自从女儿上学后，看着她从小学到大学，十几年来的辛苦，以及学校和我们给她的压力，让我心疼之余心生感慨。如今孩子艰辛疲劳的童年，与我们那代人的童年有着天壤之别。自由、散漫、大胆、好奇伴随着我的整个童年，是现在孩子无法想象的。在色彩缤纷的童年里，我是一只自由飞翔的小鸟，在思绪高远的蓝天里翱翔；在嫩绿闪亮的草尖上跳跃；在桃花林中嬉戏；用翅膀摩挲洁白的古佛塔；啄千年沧桑的银杏树叶；低飞穿过古庙那残缺的月亮门；与摩崖石刻盘旋。每想到这些，我都一种想写出来的强烈欲望。虽然我是个普通的女人，没有人关心我的童年是怎么度过，是不是幸福。但是，我还是想在脑子还清楚时，把童年有趣的事记录下来。就算是一棵小草划过天空的痕迹，把绽开无形的透明花朵，保留在纸上，以娱乐自己即将来临的老年。再就是还有一个小小私心，让我的后代们能了解真实的平民生活，或许有对我们这代人感兴趣的人，在我写的东西里面能看到一些本质，寻找出被磨损的历史毛巾上的丝丝缕缕。毕竟历史是靠我们敏感的触角，去感觉去发现，书本上的历史尘埃太厚，让人难得分辨清楚。<p/>");
		chapterDescription.append("&nbsp;&nbsp;人生很短、很短，而我们又走的太快。以至于路上的景色匆匆而过，让我们来不及回味和珍惜。当我们企图把幸福留下时，我们才发现手心竟然是空的，只有时间留下深深的印痕，让我们独自悲伤。渐渐远去的幸福竟然让人揪心，如钝刀割肉，我们被麻木的痛苦淹没。夕阳无限好，只是近黄昏，长吁短叹后，只能把无奈掩埋在音乐里，忧伤把乐符拉长。长歌当哭，当我们在音乐里泪流面满时，只有自己知道不是被感动，而是为失去而哭泣，就像孩子梦醒后注视着自己的空手掌而失落。现实和梦想边缘是昼夜的分割，那些毛边的夜晚虽然丰润了思想，却被黎明的风磨光了棱角，生命的贝壳便孕育出润泽的珍珠。<p/>");
		chapterDescription.append("&nbsp;&nbsp;临近天命之年，经历的痛苦和磨难，已经在我的脑海里越来越淡，只有幸福的镜头变的越加真切，经常在我眼前晃动。让我珍惜眼下的生活，珍惜亲情，珍惜友情，珍惜爱情，珍惜一切我生命中遇到的人。上天让我们做为人身，在滚滚红尘中煎熬炖煮，经历无数酸甜苦辣，但是我们来过，如应一个千年之约。应珍惜上天给予的机会，纷纷世间，遇到的都是缘，一切都是命中注定。我们就像是茫茫天幕上一颗流星，在人们不经意之间飞快划过，没有人注意我们，只有我们自己在意自己的感觉。我们的父母、亲人、儿女相遇，都是上天的缘分，让我们来体会人世间的喜怒哀乐，来完美和丰满生命的质量。写到这，朴树的歌在我耳边骤然响起，我喜欢那个用心灵在唱的歌手，每次听到他的歌，浮躁的心会渐渐平静下来，身体也在歌声中慢慢变轻，仿佛变成一粒尘埃，在宽阔的空间飘飘荡荡，融化在无限的虚无……");
		chapterDescription.append("&nbsp;&nbsp;工作闲时，我偷时间写下点点滴滴往事，也许将来可以读给我的外孙们听。哈、哈、写到这里竟然有些心酸。<p/>");
		chapterDescription.append("</p>");
		chapterDescription.append("</div>");
	    chapterDescription.append("</body>");
		chapterDescription.append("</html>");
	}*/
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public BookInfo getParent() {
		return parent;
	}
	public void setParent(BookInfo parent) {
		this.parent = parent;
	}
	public static void main(String[] args) {
		new BookInfo();
	}
}
