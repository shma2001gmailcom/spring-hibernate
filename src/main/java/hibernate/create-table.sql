create schema if not exists TEST;
use TEST;
create table if not exists `stock` (
  `STOCK_ID`   int(10) unsigned not null auto_increment,
  `STOCK_CODE` varchar(10)      not null,
  `STOCK_NAME` varchar(20)      not null,
  primary key (`STOCK_ID`) using btree,
  unique key `UNI_STOCK_NAME` (`STOCK_NAME`),
  unique key `UNI_STOCK_ID` (`STOCK_CODE`) using btree
)
  engine = InnoDB
  auto_increment = 11
  default charset = utf8;