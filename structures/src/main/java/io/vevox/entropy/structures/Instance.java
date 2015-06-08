package io.vevox.entropy.structures;

import java.util.UUID;

/**
 * @author Matthew Struble
 */
public interface Instance {

    UUID getUniqueId();

    default String getInstanceId(){
        return getClass().getName().substring("io.vevox.entropy".length() - 1);
    }

    default String getName(){
        return getClass().getSimpleName();
    }

}
