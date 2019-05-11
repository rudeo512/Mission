CREATE TABLE `program` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(256) DEFAULT NULL,
  `theme` varchar(256) DEFAULT NULL,
  `region` varchar(256) DEFAULT NULL,
  `introjection` varchar(256) DEFAULT NULL,
  `detail` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;