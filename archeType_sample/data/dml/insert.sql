




DROP PROCEDURE IF EXISTS create_user_tel;
create procedure create_user_tel()
begin
    declare $id int;
    set $id=100000;
    while $id <=199999
      do

        INSERT INTO heterogenity.order_base (id, order_sn, goods_id, customer_id, shop_id, amount, pay_order_id, create_time, update_time)
        VALUES ($id, concat('sn111',$id), concat(111,$id), concat(222,$id), concat(333,$id), 12.11, $id+11 , '2022-02-11 18:06:45', '2022-02-11 18:06:45');
INSERT INTO heterogenity.order_Info( base_id, order_sn, supplier_name, order_status, after_status, product_count, product_amount_total, order_amount_total, logistics_fee, address_id, pay_channel, out_trade_no, escrow_trade_no, pay_time, delivery_time, order_settlement_status, order_settlement_time, is_package, is_integral, update_time)
VALUES ( $id, concat('202202140002-',$id), concat('test-',$id), 3, 1, 1, 12.2000+$id, 12.2000+$id, 0.0000, 1223, 1, concat('4321-',$id), concat('12233322',$id), 0, 0, 0, 0, '0', '0', '2022-02-14 18:01:03');
set $id=$id+1;
end while;
end;

-- 执行存储过程
call create_user_tel();