package com.maenolis.uts.ports.inbound.rest;

import java.util.List;

public interface AbstractRestApi<T> {


    List<T> list();

}
