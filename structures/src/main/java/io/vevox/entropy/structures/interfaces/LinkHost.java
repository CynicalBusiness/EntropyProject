package io.vevox.entropy.structures.interfaces;

import io.vevox.entropy.structures.Instance;

import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author Matthew Struble
 */
public interface LinkHost extends Instance {

    Set<LinkReceiver> getLinks();

    default LinkReceiver getByUniqueId(UUID id){
        try {
            return getLinks().stream().filter(link -> link.getUniqueId().equals(id)).findFirst().get();
        } catch (NoSuchElementException e){
            return null;
        }
    }

    default Set<LinkReceiver> getByInstanceId(String instanceId){
        return getLinks().stream().filter(link -> link.getInstanceId().equals(instanceId)).collect(Collectors.toSet());
    }

}
