package de.jeter.chatex.api.events;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

public class MessageBlockedByAdManagerEvent extends ChatExEvent {
    private static final HandlerList handlers = new HandlerList();
    private boolean canceled;
    private Player player;
    private String message;
    private String pluginMessage;

    public MessageBlockedByAdManagerEvent(Player player, String message, String pluginMessage) {
        this.player = player;
        this.message = message;
        this.pluginMessage = pluginMessage;
    }

    /**
     * @return the player which fired this event
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @return the message which the player would have written.
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return Return the message which the player will receive.
     */
    public String getPluginMessage() {
        return pluginMessage;
    }

    /**
     * @param pluginMessage the message the player will receive
     */
    public void setPluginMessage(String pluginMessage) {
        this.pluginMessage = pluginMessage;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean isCancelled() {
        return canceled;
    }

    @Override
    public void setCancelled(boolean b) {
        canceled = b;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
